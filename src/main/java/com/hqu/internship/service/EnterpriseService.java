package com.hqu.internship.service;

import com.hqu.internship.bean.Enterprise;
import com.hqu.internship.dao.EnterpriseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseMapper enterpriseMapper;

    /*
    * 取得全部enterprise对象
    * */
    public List<Enterprise> allEnterprise(){
        return enterpriseMapper.selectByExample(null);
    }

    //    用email获取enterprise对象
    public Enterprise selectByEmail(String email) {
        return enterpriseMapper.selectByEmail(email);
    }

    /*
     * 插入新enterprise
     * */
    public void InsertEnterprise(Enterprise enterprise) {
        enterpriseMapper.insertSelective(enterprise);
    }

    /*
    * 根据主键取得enterprise对象
    * */
    public Enterprise getByPk(int pk){
        return enterpriseMapper.selectByPrimaryKey(pk);
    }

}
