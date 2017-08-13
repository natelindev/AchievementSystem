package com.achievement_system.core.controller;

import com.achievement_system.core.model.Article;
import com.achievement_system.core.model.ArticleForm;
import com.achievement_system.core.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ArticleController {

    private String mainFrag = "/templates/navigation";
    @Resource(name = "ArticleService")
    private ArticleService articleService;

    @RequestMapping(value = "/articles")
    public String articles(ModelMap modelMap){
        List<Article> articles = articleService.selectAll();
        modelMap.addAttribute("contentPage","articles.jsp");
        modelMap.addAttribute("articles",articles);
        return mainFrag;
    }

    @RequestMapping(value = "/articles/{articleID}")
    public String article(@PathVariable Integer articleID, ModelMap modelMap){
        Article article = articleService.selectByID(articleID);
        article.setContent(article.getContent().replace("\n","</br>"));
        modelMap.addAttribute("contentPage","article.jsp");
        modelMap.addAttribute("article", article);
        return mainFrag;
    }

    @RequestMapping(value = "/article_settings",method = RequestMethod.GET)
    public String article_settingsGET(ModelMap modelMap){
        List<Article> articles = articleService.selectAll();
        modelMap.addAttribute("contentPage","article_settings.jsp");
        modelMap.addAttribute("articles",articles);
        modelMap.addAttribute("save",false);
        modelMap.addAttribute("Form",new ArticleForm());
        return mainFrag;
    }

    @RequestMapping(value = "/article_settings",method = RequestMethod.POST)
    public String article_settingsPOST(@ModelAttribute("Form")ArticleForm form, ModelMap modelMap){
        if (form.getUpdateForm_articleID() > 0) {
            Article article = new Article();
            article.setArticleID(form.getUpdateForm_articleID());
            if (form.getUpdateForm_tittle() != null){
                article.setTittle(form.getUpdateForm_tittle());
            }else{
                article.setTittle("");
            }
            if (form.getUpdateForm_author() != null){
                article.setAuthor(form.getUpdateForm_author());
            }else{
                article.setAuthor("");
            }
            if (form.getUpdateForm_content() != null){
                article.setContent(form.getUpdateForm_content());
            }else{
                article.setContent("");
            }
            articleService.updateArticle(article);
        }
        if (!form.getInsertForm_tittle().equals("")){
            Article article = new Article();
            if (form.getInsertForm_tittle() != null){
                article.setTittle(form.getInsertForm_tittle());
            }else{
                article.setTittle("");
            }
            if (form.getInsertForm_author() != null){
                article.setAuthor(form.getInsertForm_author());
            }else{
                article.setAuthor("");
            }
            if (form.getInsertForm_content() != null){
                article.setContent(form.getInsertForm_content());
            }else{
                article.setContent("");
            }
            articleService.insertArticle(article);
        }
        if (form.getDeleteForm_articleID() > 0) {
            Article article = new Article();
            article.setArticleID(form.getDeleteForm_articleID());
            articleService.deleteArticle(article);
        }

        modelMap.addAttribute("contentPage","article_settings.jsp");
        modelMap.addAttribute("save",true);
        return mainFrag;
    }


}
