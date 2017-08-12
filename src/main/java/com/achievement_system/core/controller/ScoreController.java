package com.achievement_system.core.controller;

import com.achievement_system.core.model.Score;
import com.achievement_system.core.service.ScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(value = "/score")
public class ScoreController {

    private String mainFrag = "/templates/navigation";
    @Resource(name = "ScoreService")
    ScoreService scoreService;

    @RequestMapping(method = RequestMethod.GET)
    public String addForm(ModelMap modelMap){
        List<Score> scores = scoreService.selectAll();
        for (Score s: scores) {
            s.calculateTotalScore();
        }
        Collections.sort(scores);
        modelMap.addAttribute("contentPage","score.jsp");
        modelMap.addAttribute("allScores", scores);
        return mainFrag;
    }
}
