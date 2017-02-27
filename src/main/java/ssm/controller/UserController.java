package ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.Service.UserService;
import ssm.entity.User;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by fy on 2017/2/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/register")
    public String userRegister(User user){
        System.out.println("username: "+user.getUsername());
        System.out.println("email: "+user.getEmail());
        System.out.println("password"+user.getPassword());
        user.setType('p');
        try {
            userService.add(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "showResult";
    }

    @RequestMapping("/check")
    public String checkUserName(String username){
        User existingUser = userService.getByUsername(username);
        if(existingUser == null){

        }else{

        }
        return "showResult";
    }

    @RequestMapping("/testAddUser")
    public String addUser(){ // pass test

        System.out.println("going to test add user");
        User user = new User();
        user.setUsername("Fyy");
        user.setPassword("123456");
        user.setMobile("110");
        user.setEmail("12345@qq.com");
        user.setType('p');
        try {
            userService.add(user);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "showResult";
    }

    @RequestMapping("/testDeleteUser")
    public String deleteById(Long id){ // pass test

        try{
            userService.deleteById(2l);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "showResult";
    }

    @RequestMapping("/testGetAllUser")
    public String getAllUser(HttpServletRequest request, Model model){ // pass test
        try {
            List<User> userList = userService.getAll();
            model.addAttribute("userList", userList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "showResult";
    }

    @RequestMapping("/getUserById")
    public String getUserById(HttpServletRequest request, Model model){ // pass test
        try {
            User user = userService.getById(1l);
            model.addAttribute("user", user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "showResult";
    }
}
