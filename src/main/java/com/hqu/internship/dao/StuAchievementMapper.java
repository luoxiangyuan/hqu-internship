package com.hqu.internship.dao;

import com.hqu.internship.bean.StuAchievement;
import com.hqu.internship.bean.StuAchievementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public interface StuAchievementMapper {
    long countByExample(StuAchievementExample example);

    int deleteByExample(StuAchievementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StuAchievement record);

    int insertSelective(StuAchievement record);

    List<StuAchievement> selectByExample(StuAchievementExample example);

    StuAchievement selectByApplyId(int applyId);

    StuAchievement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StuAchievement record, @Param("example") StuAchievementExample example);

    int updateByExample(@Param("record") StuAchievement record, @Param("example") StuAchievementExample example);

    int updateByPrimaryKeySelective(StuAchievement record);

    int updateByPrimaryKey(StuAchievement record);
}