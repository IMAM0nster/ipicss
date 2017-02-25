package ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.Service.UserService;

import javax.annotation.Resource;

/**
 * Created by fy on 2017/2/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/testAddUser")
    public String addUser(){

        // add a user here

        return "showResult";
    }
}
