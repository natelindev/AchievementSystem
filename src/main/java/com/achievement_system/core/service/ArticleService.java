package com.achievement_system.core.service;

import com.achievement_system.core.model.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> selectAll();
    public Article selectByID(Integer id);
    public void insertArticle(Article article);
    public void updateArticle(Article article);
    public void deleteArticle(Article article);
}
