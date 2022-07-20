package cn.jxufe.lyl.controller;

import cn.jxufe.lyl.domain.User;
import cn.jxufe.lyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有的用户
    @RequestMapping("/allUser")
    public String allUser(Model model){
        List<User> list = userService.queryAllUser();
        model.addAttribute("list", list);
        return "allUser";
    }

    //添加用户
    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "forward:/user/allUser";
    }

    //点击【修改】时，跳转到修改页面
    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(Model model,int user_id){
        User user = userService.queryUserById(user_id);
        model.addAttribute("user",user);
        return "updateUser";
    }
    //修改用户
    @RequestMapping("/updateUser")
    public String updateUser(User user){
        System.out.println(user);
        userService.updateUser(user);
        System.out.println(user);
        return "forward:/user/allUser";
    }

    //删除
    @RequestMapping("/del/{userId}")
    public String deleteUser(@PathVariable("userId") int user_id){
        userService.deleteUser(user_id);
        return "forward:/user/allUser";
    }

    //根据姓名查询用户
    @RequestMapping("/queryUserByName")
    public String queryUserByName(String username,Model model){

        User user = userService.queryUserByName(username);
        List<User> list=new ArrayList<User>();
        list.add(user);
        if(user==null){
            list = userService.queryAllUser();
            model.addAttribute("error","未查到");
        }

        model.addAttribute("list",list);
        return "allUser";

    }

}

