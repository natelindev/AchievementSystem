package com.achievement_system.core.controller;


import com.achievement_system.core.model.*;
import com.achievement_system.core.service.ArticleService;
import com.achievement_system.core.service.ScoreService;
import com.achievement_system.core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Resource(name = "UserService")
    private UserService userService;
    @Resource(name = "ScoreService")
    private ScoreService scoreService;

    @RequestMapping(method = RequestMethod.GET)
    public String addForm(Model model){
        User user = new User();
        model.addAttribute("userForm",user);
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login(@ModelAttribute User user, ModelMap modelMap){
        List<User> allUsers = userService.selectAll();
        if (allUsers != null){
            for (User cur_user : allUsers){
                if (cur_user.getUserName().equals(user.getUserName())){
                    if (cur_user.getUserPassword().equals(user.getUserPassword())){
                        List<Score> scores = scoreService.selectAll();
                        modelMap.addAttribute("save",false);
                        modelMap.addAttribute("Form",new Form());
                        modelMap.addAttribute("allScores",scores);
                        modelMap.addAttribute("contentPage","settings.jsp");
                        return "/templates/navigation";
                    }else{
                        modelMap.addAttribute("message","用户名或密码错误");
                        modelMap.addAttribute("userForm",new User());
                        return "login";
                    }
                }
            }
        }

        modelMap.addAttribute("message","该用户不存在");
        modelMap.addAttribute("userForm",new User());
        return "login";
    }

}