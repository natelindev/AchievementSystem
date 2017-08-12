package com.achievement_system.core.controller;

import com.achievement_system.core.model.*;
import com.achievement_system.core.service.ScoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/settings")
public class SettingController {
    private String mainFrag = "/templates/navigation";
    private String contentPage = "contentPage";

    @Resource(name = "ScoreService")
    ScoreService scoreService;

    @RequestMapping(method = RequestMethod.GET)
    public String settingsGET(ModelMap modelMap){
        List<Score> scores = scoreService.selectAll();
        modelMap.addAttribute(contentPage,"settings.jsp");
        modelMap.addAttribute("save",false);
        modelMap.addAttribute("Form",new Form());
        modelMap.addAttribute("allScores", scores);
        return mainFrag;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String settingsPOST(@ModelAttribute("Form")Form form, ModelMap modelMap){
        modelMap.addAttribute(contentPage,"settings.jsp");
        if (form.getUpdateForm_studentID() > 0) {
            //has something in update form
            Score updateScore = new Score();
            if (form.getUpdateForm_studentID() == null) {
                updateScore.setStudentID(0);
            } else {
                updateScore.setStudentID(form.getUpdateForm_studentID());
            }
            if (form.getUpdateForm_otmScore() == null) {
                updateScore.setOtmScore(0);
            } else {
                updateScore.setOtmScore(form.getUpdateForm_otmScore());
            }
            if (form.getUpdateForm_asnScore() == null) {
                updateScore.setAsnScore(0);
            } else {
                updateScore.setAsnScore(form.getUpdateForm_asnScore());
            }
            if (form.getUpdateForm_icbScore() == null) {
                updateScore.setIcbScore(0);
            } else {
                updateScore.setIcbScore(form.getUpdateForm_icbScore());
            }
            if (form.getUpdateForm_clnScore() == null) {
                updateScore.setClnScore(0);
            } else {
                updateScore.setClnScore(form.getUpdateForm_clnScore());
            }
            if (form.getUpdateForm_gddScore() == null) {
                updateScore.setGddScore(0);
            } else {
                updateScore.setGddScore(form.getUpdateForm_gddScore());
            }
            if (form.getUpdateForm_gssScore() == null) {
                updateScore.setGssScore(0);
            } else {
                updateScore.setGssScore(form.getUpdateForm_gssScore());
            }
            if (form.getUpdateForm_pgsScore() == null) {
                updateScore.setPgsScore(0);
            } else {
                updateScore.setPgsScore(form.getUpdateForm_pgsScore());
            }
            if (form.getUpdateForm_dspScore() == null) {
                updateScore.setDspScore(0);
            } else {
                updateScore.setDspScore(form.getUpdateForm_dspScore());
            }
            if (form.getUpdateForm_hldScore() == null) {
                updateScore.setHldScore(0);
            } else {
                updateScore.setHldScore(form.getUpdateForm_hldScore());
            }
            if (form.getUpdateForm_gpaScore() == null) {
                updateScore.setGpaScore(0);
            } else {
                updateScore.setGpaScore(form.getUpdateForm_gpaScore());
            }
            if (form.getUpdateForm_cmpScore() == null) {
                updateScore.setCmpScore(0);
            } else {
                updateScore.setCmpScore(form.getUpdateForm_cmpScore());
            }
            if (form.getUpdateForm_fmlScore() == null) {
                updateScore.setFmlScore(0);
            } else {
                updateScore.setFmlScore(form.getUpdateForm_fmlScore());
            }
            scoreService.updateScore(updateScore);
        }
        if (!form.getInsertForm_studentName().equals("")){
            Score insertScore = new Score();
            if(form.getInsertForm_studentName() == null){
                insertScore.setStudentName("");
            }else{
                insertScore.setStudentName(form.getInsertForm_studentName());
            }
            if(form.getInsertForm_otmScore() == null){
                insertScore.setOtmScore(0);
            }else{
                insertScore.setOtmScore(form.getInsertForm_otmScore());
            }
            if(form.getInsertForm_asnScore() == null){
                insertScore.setAsnScore(0);
            }else{
                insertScore.setAsnScore(form.getInsertForm_asnScore());
            }
            if(form.getInsertForm_icbScore() == null){
                insertScore.setIcbScore(0);
            }else{
                insertScore.setIcbScore(form.getInsertForm_icbScore());
            }
            if(form.getInsertForm_clnScore() == null){
                insertScore.setClnScore(0);
            }else{
                insertScore.setClnScore(form.getInsertForm_clnScore());
            }
            if(form.getInsertForm_gddScore() == null){
                insertScore.setGddScore(0);
            }else{
                insertScore.setGddScore(form.getInsertForm_gddScore());
            }
            if(form.getInsertForm_gssScore() == null){
                insertScore.setGssScore(0);
            }else{
                insertScore.setGssScore(form.getInsertForm_gssScore());
            }
            if(form.getInsertForm_pgsScore() == null){
                insertScore.setPgsScore(0);
            }else{
                insertScore.setPgsScore(form.getInsertForm_pgsScore());
            }
            if(form.getInsertForm_dspScore() == null){
                insertScore.setDspScore(0);
            }else{
                insertScore.setDspScore(form.getInsertForm_dspScore());
            }
            if(form.getInsertForm_hldScore() == null){
                insertScore.setHldScore(0);
            }else{
                insertScore.setHldScore(form.getInsertForm_hldScore());
            }
            if(form.getInsertForm_gpaScore() == null){
                insertScore.setGpaScore(0);
            }else{
                insertScore.setGpaScore(form.getInsertForm_gpaScore());
            }
            if(form.getInsertForm_cmpScore() == null){
                insertScore.setCmpScore(0);
            }else{
                insertScore.setCmpScore(form.getInsertForm_cmpScore());
            }
            if(form.getInsertForm_fmlScore() == null){
                insertScore.setFmlScore(0);
            }else{
                insertScore.setFmlScore(form.getInsertForm_fmlScore());
            }
            scoreService.insertScore(insertScore);
        }
        if (form.getDeleteForm_studentID() > 0){
            //has something in delete form
            Score deleteScore = new Score();
            deleteScore.setStudentID(form.getDeleteForm_studentID());
            scoreService.deleteScore(deleteScore);
        }
        modelMap.addAttribute("save",true);
        return mainFrag;
    }
}
