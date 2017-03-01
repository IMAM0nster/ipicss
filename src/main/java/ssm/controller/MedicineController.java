package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.Service.MedicineService;
import ssm.entity.Medicine;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

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

    @ResponseBody
    @RequestMapping("search")
    public List<Medicine> findSuitableMedicines(String keyword, String forbidden, Integer page, Model model){
        List<Medicine> suitableMedicines = medicineService.findSuitableMedicines(keyword, forbidden, page);
        model.addAttribute("keyword", keyword);
        model.addAttribute("forbidden", forbidden);
        model.addAttribute("currentpage", page);
        return suitableMedicines;
    }

    @RequestMapping("getImg")
    public void getImg(Long medicineId, HttpServletResponse response) throws IOException {
        InputStream inputStream = medicineService.getImg(medicineId);
        response.setContentType("image/jpg");
        if(inputStream!=null){
            OutputStream outputStream = response.getOutputStream();
            byte[] data = new byte[1024];
            while(inputStream.read(data) != -1){
                outputStream.write(data);
            }
            inputStream.close();
            outputStream.flush();
            outputStream.close();
        }

    }

}
