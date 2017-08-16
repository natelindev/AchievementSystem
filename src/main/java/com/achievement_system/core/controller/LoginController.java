package com.achievement_system.core.controller;


import com.achievement_system.core.model.*;
import com.achievement_system.core.service.ArticleService;
import com.achievement_system.core.service.ScoreService;
import com.achievement_system.core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginController {

    @Resource(name = "UserService")
    private UserService userService;
    @Resource(name = "ScoreService")
    private ScoreService scoreService;
    @Resource(name = "ArticleService")
    private ArticleService articleService;

    @RequestMapping(value = "/login/{target}",method = RequestMethod.GET)
    public String addForm(@PathVariable String target,Model model){
        User user = new User();
        model.addAttribute("userForm",user);
        model.addAttribute("source",target);
        return "login";
    }

    @RequestMapping(value = "/login/{target}",method = RequestMethod.POST)
    public String login(@PathVariable String target,@ModelAttribute User user, ModelMap modelMap){
        List<User> allUsers = userService.selectAll();
        if (allUsers != null){
            for (User cur_user : allUsers){
                if (cur_user.getUserName().equals(user.getUserName())){
                    if (cur_user.getUserPassword().equals(user.getUserPassword())){
                        if (target.equals("score")) {
                            List<Score> scores = scoreService.selectAll();
                            modelMap.addAttribute("save",false);
                            modelMap.addAttribute("Form",new Form());
                            modelMap.addAttribute("allScores",scores);
                            modelMap.addAttribute("contentPage", "settings.jsp");
                        } else if (target.equals("article")) {
                            List<Article> articles = articleService.selectAll();
                            modelMap.addAttribute("articles",articles);
                            modelMap.addAttribute("save",false);
                            modelMap.addAttribute("Form",new ArticleForm());
                            modelMap.addAttribute("contentPage", "article_settings.jsp");
                        } else {
                            modelMap.addAttribute("userForm", new User());
                            modelMap.addAttribute("message", "非法访问，请回到主页重新登录");
                            return "login";
                        }
                        return "/templates/navigation";
                    }else{
                        modelMap.addAttribute("userForm",new User());
                        modelMap.addAttribute("message","用户名或密码错误");
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