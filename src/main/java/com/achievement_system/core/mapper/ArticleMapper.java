package com.achievement_system.core.mapper;

import com.achievement_system.core.model.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ArticleMapper")
public interface ArticleMapper {
    @Select("select * from articles")
    @Results(value = {@Result(id = true, property = "articleID", column = "ARTICLE_ID"),
            @Result(property = "author", column = "AUTHOR"),
            @Result(property = "tittle",column = "TITTLE"),
            @Result(property = "content",column = "USER_PASSWORD")
    })
    public List<Article> selectAll();

    @Select("select * from articles where ARTICLE_ID = #{id}")
    @Results(value = {@Result(id = true, property = "articleID", column = "ARTICLE_ID"),
            @Result(property = "author", column = "AUTHOR"),
            @Result(property = "tittle",column = "TITTLE"),
            @Result(property = "content",column = "USER_PASSWORD")
    })
    public Article selectByID(Integer id);

    @Insert("insert into articles(TITTLE,AUTHOR,CONTENT) values(#{tittle},#{author},#{content})")
    public void insertArticle(Article article);

    @Update("update articles set TITTLE = #{tittle}, AUTHOR = #{author},CONTENT = #{content} where ARTICLE_ID = #{articleID}")
    public void updateArticle(Article article);

    @Delete("delete from articles where ARTICLE_ID = #{articleID}")
    public void deleteArticle(Article article);
}
