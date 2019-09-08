package com.hqu.internship.dao;

import com.hqu.internship.bean.InternshipDetail;
import com.hqu.internship.bean.InternshipDetailExample;
import java.util.List;

import jdk.jfr.Registered;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface InternshipDetailMapper {
    long countByExample(InternshipDetailExample example);

    int deleteByExample(InternshipDetailExample example);

    int deleteByPrimaryKey(Integer internshipId);

    int insert(InternshipDetail record);

    int insertSelective(InternshipDetail record);

    List<InternshipDetail> selectByExample(InternshipDetailExample example);

    List<InternshipDetail> selectByEtpId(int enterpriseId);

    List<InternshipDetail> selectByEtpIdSta(int enterpriseId,int status);

    InternshipDetail selectByPrimaryKey(Integer internshipId);

    int updateByExampleSelective(@Param("record") InternshipDetail record, @Param("example") InternshipDetailExample example);

    int updateByExample(@Param("record") InternshipDetail record, @Param("example") InternshipDetailExample example);

    int updateByPrimaryKeySelective(InternshipDetail record);

    int updateByPrimaryKey(InternshipDetail record);
}