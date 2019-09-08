package com.hqu.internship.service;

import com.hqu.internship.bean.StuApply;
import com.hqu.internship.dao.StuApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyService {
    @Autowired
    StuApplyMapper stuApplyMapper;

    /*
    * 根据id修改apply
    * */
    public void updateById(StuApply stuApply){
        stuApplyMapper.updateByPrimaryKeySelective(stuApply);
    }

    /*
    * 根据实训id查出所有申请
    * */
    public List<StuApply> getByExpId(int expId){
        return stuApplyMapper.selectByExpId(expId);
    }

    /*
    * 根据实训id查出所有申请和status
    * */
    public List<StuApply> getByExpIdSta(int expId,int status){
        return stuApplyMapper.selectByExpIdStatus(expId, status);
    }

}
