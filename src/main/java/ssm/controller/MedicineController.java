package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.Service.MedicineService;

import javax.annotation.Resource;

/**
 * Created by fy on 2017/2/28.
 */
@Controller
@RequestMapping("/medicine")
public class MedicineController {

    @Resource
    private MedicineService medicineService;


}
