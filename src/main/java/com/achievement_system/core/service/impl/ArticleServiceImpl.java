package com.achievement_system.core.service.impl;

import com.achievement_system.core.mapper.ArticleMapper;
import com.achievement_system.core.model.Article;
import com.achievement_system.core.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService{
    @Resource(name = "ArticleMapper")
    private ArticleMapper articleMapper;

    public List<Article> selectAll(){ return articleMapper.selectAll();}
    public Article selectByID(Integer id){return articleMapper.selectByID(id);}
    public void insertArticle(Article article){articleMapper.insertArticle(article);}
    public void updateArticle(Article article){articleMapper.updateArticle(article);}
    public void deleteArticle(Article article){articleMapper.deleteArticle(article);};
}
