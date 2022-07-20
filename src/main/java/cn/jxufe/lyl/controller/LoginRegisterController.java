package cn.jxufe.lyl.controller;

import cn.jxufe.lyl.domain.Admin;
import cn.jxufe.lyl.domain.User;
import cn.jxufe.lyl.service.LoginRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@Controller
@RequestMapping("/view")
public class LoginRegisterController {
    @Autowired
    private LoginRegisterService loginRegisterService;

    //用户登录
    @RequestMapping("/userLogin")
    public String login(User user, Model model) {

        try {
            User user1 = loginRegisterService.login(user);
            if (user1 != null) {
                model.addAttribute(user1);
                return "userView";
            }else {
                model.addAttribute("operation", "登录");
                model.addAttribute("reason", "用户名或密码不正确");
                return "failure";
            }
        } catch (SQLException e) {
            model.addAttribute("reason", e.getLocalizedMessage());
            return "404";
        }
    }
    //管理员登录
    @RequestMapping("adminLogin")
    public String adminLogin(Admin admin, Model model){
        try{
                Admin admin1 = loginRegisterService.adminLogin(admin);
            if(admin1 != null){
                model.addAttribute(admin1);
                return "adminView";
            }else{
                model.addAttribute("operation", "登录");
                model.addAttribute("reason", "管理员用户名或密码不正确");
                return "failure";
            }
        }catch (SQLException e){
            model.addAttribute("reason", e.getLocalizedMessage());
            return "404";
        }
    }

    @RequestMapping("/register")
    public String register(User user, Model model){
        try {
            if (loginRegisterService.register(user)){
                model.addAttribute(user);
                model.addAttribute("operation","注册");
                return "registerSuccess";
            }else {
                model.addAttribute("operation", "注册");
                model.addAttribute("reason", "输入不能为空");
                return "failure";
            }
        }catch (SQLException e){
            model.addAttribute("reason", e.getLocalizedMessage());
            return "404";
        }

    }


}
