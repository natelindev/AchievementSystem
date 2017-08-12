package com.achievement_system.core.mapper;

import com.achievement_system.core.model.Score;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ScoreMapper")
public interface ScoreMapper {
    @Select("select * from scores")
    @Results(value = {@Result(id = true, property = "studentID", column = "STUDENT_ID"),
            @Result(property = "studentName", column = "STUDENT_NAME"),
            @Result(property = "otmScore", column = "按时到校"),//On time score
            @Result(property = "asnScore", column = "完成作业"),//Assignment score
            @Result(property = "icbScore", column = "上课发言"),//In class behaving score
            @Result(property = "clnScore", column = "打扫卫生"),//Cleaning score
            @Result(property = "gddScore", column = "好人好事"),//Good deed score
            @Result(property = "gssScore", column = "成绩优异"),//Good score score
            @Result(property = "pgsScore", column = "学习进步"),//Progressing score
            @Result(property = "dspScore", column = "遵守纪律"),//Discipline score
            @Result(property = "hldScore", column = "节日送分"),//Holiday score
            @Result(property = "gpaScore", column = "集体活动"),//Group activity score
            @Result(property = "cmpScore", column = "学校比赛"),//Competition score
            @Result(property = "fmlScore", column = "家庭表现"),//Family behavior score
    })
    public List<Score> selectAll();

    @Insert("insert into scores(" +
            "STUDENT_NAME," +
            "按时到校," +
            "完成作业," +
            "上课发言," +
            "打扫卫生," +
            "好人好事," +
            "成绩优异," +
            "学习进步," +
            "遵守纪律," +
            "节日送分," +
            "集体活动," +
            "学校比赛," +
            "家庭表现) " +
            "values(" +
            "#{studentName}," +
            "#{otmScore}," +
            "#{asnScore}," +
            "#{icbScore}," +
            "#{clnScore}," +
            "#{gddScore}," +
            "#{gssScore}," +
            "#{pgsScore}," +
            "#{dspScore}," +
            "#{hldScore}," +
            "#{gpaScore}," +
            "#{cmpScore}," +
            "#{fmlScore})")
    public void insertScore(Score score);

    @Update("update scores set 按时到校 = #{otmScore} " +
            ", 完成作业 = #{asnScore} " +
            ", 上课发言 = #{icbScore} " +
            ", 打扫卫生 = #{clnScore} " +
            ", 好人好事 = #{gddScore} " +
            ", 成绩优异 = #{gssScore} " +
            ", 学习进步 = #{pgsScore} " +
            ", 遵守纪律 = #{dspScore} " +
            ", 节日送分 = #{hldScore} " +
            ", 集体活动 = #{gpaScore} " +
            ", 学校比赛 = #{cmpScore} " +
            ", 家庭表现 = #{fmlScore} " +
            "where STUDENT_ID = #{studentID}")
    public void updateScore(Score score);

    @Delete("delete from scores where STUDENT_ID = #{studentID}")
    public void deleteScore(Score score);

}
