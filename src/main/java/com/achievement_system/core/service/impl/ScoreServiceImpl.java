package com.achievement_system.core.service.impl;

import com.achievement_system.core.mapper.ScoreMapper;
import com.achievement_system.core.model.Score;
import com.achievement_system.core.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ScoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource(name = "ScoreMapper")
    private ScoreMapper scoreMapper;

    public List<Score> selectAll() {
        return scoreMapper.selectAll();
    }
    public Score selectByID(Integer id){return scoreMapper.selectByID(id);}
    public void insertScore(Score score){ scoreMapper.insertScore(score);}
    public void updateScore(Score score){ scoreMapper.updateScore(score);}
    public void deleteScore(Score score){ scoreMapper.deleteScore(score);}
}
