package com.hqu.internship.dao;

import com.hqu.internship.bean.StuApply;
import com.hqu.internship.bean.StuApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StuApplyMapper {
    long countByExample(StuApplyExample example);

    int deleteByExample(StuApplyExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(StuApply record);

    int insertSelective(StuApply record);

    List<StuApply> selectByExample(StuApplyExample example);

    List<StuApply> selectByExpId(int expId);

    List<StuApply> selectByExpIdStatus(int expId,int status);

    StuApply selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") StuApply record, @Param("example") StuApplyExample example);

    int updateByExample(@Param("record") StuApply record, @Param("example") StuApplyExample example);

    int updateByPrimaryKeySelective(StuApply record);

    int updateByPrimaryKey(StuApply record);
}