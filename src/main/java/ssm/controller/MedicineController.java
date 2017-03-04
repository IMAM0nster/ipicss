package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.Service.MedicineService;
import ssm.entity.Medicine;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fy on 2017/2/28.
 */
@Controller
@RequestMapping("/medicine")
public class MedicineController {

    @Resource
    private MedicineService medicineService;

    @RequestMapping("initProductPage")
    public String InitProductPage(String search, Model model){
        System.out.println("going to search "+search);
        model.addAttribute("keyword", search);
        model.addAttribute("forbidden", null);
        model.addAttribute("currentpage", 1);
        return "product";
    }

//    return json: {maxpage:23, result:[{id:1, name:"a", price:1.00, pic:"http://..."}]}
    @ResponseBody
    @RequestMapping("search")
    public Map<String , Object> findSuitableMedicines(String keyword, String forbidden, Integer page){
        Integer pageSize = 20;
        Map<String, Object> responseJSON = new HashMap<String, Object>();
        Map<String, Object> item = new HashMap<String, Object>();
        List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();

        Integer numOfMatch = medicineService.countSuitableMedicines(keyword, forbidden);
        if (numOfMatch == 0) {
            responseJSON.put("maxpage", 0);
            return responseJSON;
        }

        List<Medicine> medicineList = medicineService.findSuitableMedicines(keyword, forbidden, page, pageSize);
        for (Medicine medicine : medicineList) {
            item.clear();
            item.put("id", medicine.getId());
            item.put("name", medicine.getName());
            item.put("price", medicine.getPrice());
            item.put("pic", "https://static.mengniang.org/common/thumb/7/77/Richang_02.JPG/250px-Richang_02.JPG"); // nichijo xD
            results.add(item);
        }
        responseJSON.put("maxpage", numOfMatch/pageSize);
        responseJSON.put("results", results);

        return responseJSON;
    }
}
