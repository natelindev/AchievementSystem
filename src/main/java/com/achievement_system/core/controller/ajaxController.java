package com.achievement_system.core.controller;

import com.achievement_system.core.model.Article;
import com.achievement_system.core.model.Score;
import com.achievement_system.core.service.ArticleService;
import com.achievement_system.core.service.ScoreService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ajaxController {

    private String mainFrag = "/templates/navigation";
    @Resource(name = "ScoreService")
    private ScoreService scoreService;

    @Resource(name = "ArticleService")
    private ArticleService articleService;

    @RequestMapping(value = "/ajax_getStudentInfo")
    public @ResponseBody String getStudentInfo(@RequestParam("studentID")Integer studentID){
        Score s = scoreService.selectByID(studentID);
        String result;
        result =  "" + s.getOtmScore() + "," + s.getAsnScore() + "," + s.getIcbScore() + "," + s.getClnScore() + "," + s.getGddScore() + "," + s.getGssScore() + "," + s.getPgsScore() + "," + s.getDspScore() + "," + s.getHldScore() + "," + s.getGpaScore() + "," + s.getCmpScore() + "," + s.getFmlScore();
        return result;
    }

    @RequestMapping(value = "/ajax_getArticleInfo")
    public @ResponseBody ResponseEntity<String> getArticleInfo(@RequestParam("articleID")Integer articleID, HttpServletResponse response) {
        Article a = articleService.selectByID(articleID);
        String result;
        result = "" + a.getTittle() +'&'+ a.getAuthor() + '&' + a.getContent();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "text/plain; charset=utf-8");
        return new ResponseEntity<String>(result, responseHeaders, HttpStatus.CREATED);
    }

}
