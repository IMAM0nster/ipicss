package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.Service.MedicineService;
import ssm.Service.MongoDBService;
import ssm.entity.Medicine;

import javax.annotation.Resource;
import javax.jws.WebParam;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
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

    @Resource
    private MongoDBService mongoDBService;

    @RequestMapping("initProductPage")
    public String InitProductPage(String search, Model model){
        System.out.println("going to search "+search);
        model.addAttribute("keyword", search);
        model.addAttribute("forbidden", null);
        model.addAttribute("currentpage", 1);
        return "product";
    }

    @RequestMapping("getPic")
    public void testMongoDBGetPic(HttpServletResponse response, Long id){
        InputStream inputStream = mongoDBService.getFileStream("ipicss", "medicinePic", id.toString());
        response.setContentType("img/jpg");
        try {
            OutputStream outputStream = response.getOutputStream();
            int len = 0;
            byte[] buf = new byte[1024];
            while((len = inputStream.read(buf, 0, 1024))!=-1){
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

//    return json: {maxpage:23, result:[{id:1, name:"a", price:1.00, pic:"http://..."}]}
    @ResponseBody
    @RequestMapping(value = "search")
    public Map<String , Object> findSuitableMedicines(String keyword, String forbidden, Integer page) throws UnsupportedEncodingException {
        String keyword_dec = URLDecoder.decode(keyword,"utf-8");
        Integer pageSize = 20;
        Map<String, Object> responseJSON = new HashMap<String, Object>();
        List<Map<String, Object>> results = new ArrayList<Map<String, Object>>();

        Integer numOfMatch = medicineService.countSuitableMedicines(keyword_dec, forbidden);
        if (numOfMatch == 0) {
            responseJSON.put("maxpage", 0);
            return responseJSON;
        }

        List<Medicine> medicineList = medicineService.findSuitableMedicines(keyword_dec, forbidden, page, pageSize);
        for (Medicine medicine : medicineList) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("id", medicine.getId());
            item.put("name", medicine.getName());
            item.put("price", medicine.getPrice());
            item.put("pic", "https://localhost:8080/ipicss/medicine/getPic?id="+medicine.getId()); // nichijo xD
            results.add(item);
        }
        responseJSON.put("maxpage", numOfMatch/pageSize);
        responseJSON.put("results", results);

        return responseJSON;
    }
}
