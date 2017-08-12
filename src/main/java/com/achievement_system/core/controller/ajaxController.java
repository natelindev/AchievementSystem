package com.achievement_system.core.controller;

import com.achievement_system.core.model.Score;
import com.achievement_system.core.service.ScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ajaxController {

    private String mainFrag = "/templates/navigation";
    @Resource(name = "ScoreService")
    ScoreService scoreService;

    @RequestMapping(value = "/ajax_getStudentInfo")
    public @ResponseBody String getStudentInfo(@RequestParam("studentID")Integer studentID,Model model){
        List<Score> scores = scoreService.selectAll();
        Score found_score = new Score();
        for (Score s : scores){
            if(s.getStudentID().equals(studentID)){
                found_score = s;
                break;
            }
        }
        String result;
        result =  "" + found_score.getOtmScore() + "," + found_score.getAsnScore() + "," + found_score.getIcbScore() + "," + found_score.getClnScore() + "," + found_score.getGddScore() + "," + found_score.getGssScore() + "," + found_score.getPgsScore() + "," + found_score.getDspScore() + "," + found_score.getHldScore() + "," + found_score.getGpaScore() + "," + found_score.getCmpScore() + "," + found_score.getFmlScore();
        return result;
    }
}
