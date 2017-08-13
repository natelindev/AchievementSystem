package com.achievement_system.core.service;

import com.achievement_system.core.model.Score;

import java.util.List;

public interface ScoreService {
    public List<Score> selectAll();
    public Score selectByID(Integer id);
    public void insertScore(Score score);
    public void updateScore(Score score);
    public void deleteScore(Score score);

}
