package com.hqu.internship.service;

import com.hqu.internship.bean.InternshipDetail;
import com.hqu.internship.dao.InternshipDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {

    @Autowired
    InternshipDetailMapper internshipMapper;

    public void insertIntership(InternshipDetail internshipDetail){
        internshipMapper.insert(internshipDetail);
    }

    public void delInternshipById(int id){
        internshipMapper.deleteByPrimaryKey(id);
    }

    public void updateByPkSelective(InternshipDetail newInternship){
        internshipMapper.updateByPrimaryKeySelective(newInternship);
    }

    public List<InternshipDetail> getAllByEnterpriseId(int enterpriseId){
        return internshipMapper.selectByEtpId(enterpriseId);
    }

    public List<InternshipDetail> getAllByEnterpriseIdSta(int enterpriseId,int status){
        return internshipMapper.selectByEtpIdSta(enterpriseId,status);
    }

    public InternshipDetail getByPk(int internshipId){
        return internshipMapper.selectByPrimaryKey(internshipId);
    }
}
