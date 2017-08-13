package com.achievement_system.core.controller;

import com.achievement_system.core.model.Score;
import com.achievement_system.core.service.ArticleService;
import com.achievement_system.core.service.ScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Controller
public class IndexController {

    private String mainFrag = "/templates/navigation";
    private String contentPage = "contentPage";

    @Resource(name = "ScoreService")
    private ScoreService scoreService;

    @RequestMapping(value = "/index")
    public String index(ModelMap modelMap){
        List<Score> scores = scoreService.selectAll();
        for (Score s: scores) {
            s.calculateTotalScore();
        }
        Collections.sort(scores);
        modelMap.addAttribute(contentPage,"score.jsp");
        modelMap.addAttribute("allScores", scores);
        return mainFrag;
    }

}
