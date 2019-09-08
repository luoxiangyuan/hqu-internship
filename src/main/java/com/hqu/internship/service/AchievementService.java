package com.hqu.internship.service;

import com.hqu.internship.bean.StuAchievement;
import com.hqu.internship.dao.StuAchievementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementService {

    @Autowired
    StuAchievementMapper achievementMapper;

    public StuAchievement getByApplyId(int applyId){
        return achievementMapper.selectByApplyId(applyId);
    }

    public void updateByPk(StuAchievement achievement){
        achievementMapper.updateByPrimaryKeySelective(achievement);
    }

}
