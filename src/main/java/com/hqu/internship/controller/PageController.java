package com.hqu.internship.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqu.internship.bean.InternshipDetail;
import com.hqu.internship.bean.Obj;
import com.hqu.internship.bean.StuApply;
import com.hqu.internship.service.ApplyService;
import com.hqu.internship.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.ObjectView;
import java.util.ArrayList;
import java.util.List;

/*
* 处理分页请求的控制器
* */
@RestController
public class PageController {

    @Autowired
    ApplyService applyService;

    @Autowired
    InternshipService internshipService;

    @Autowired
    Obj obj;

    /*
    * 企业分页查询实训申请
    * */
    @GetMapping("/api/enterprise/applicationlist")
    public Obj getApplyList(@RequestParam String internshipId,@RequestParam String page, @RequestParam(required = false) String status){

        PageHelper.startPage(Integer.valueOf(page),10);

        if(status == null){ //判断是否传入status参数
            List<StuApply> applies = applyService.getByExpId(Integer.valueOf(internshipId));
            PageInfo pageInfo = new PageInfo(applies);
            obj.add("data",pageInfo.getList());
        }else {
            List<StuApply> applies = applyService.getByExpIdSta(Integer.valueOf(internshipId),Integer.valueOf(status));
            PageInfo pageInfo = new PageInfo(applies);
            obj.add("data",pageInfo.getList());
        }
        obj.success();
        return obj;
    }

    /*
    * 企业分页查询实训
    * */
    @GetMapping("/api/enterprise/internshiplist")
    public Obj getExpList(@RequestParam int page, @RequestParam(required = false) String status, HttpSession session){
        PageHelper.startPage(page,10);

        if(status == null){
            List<InternshipDetail> internshipDetailList = internshipService.getAllByEnterpriseId((int) session.getAttribute("enterpriseId"));
            PageInfo pageInfo = new PageInfo(internshipDetailList);
            obj.add("data",pageInfo.getList());
        }else {
            List<InternshipDetail> internshipDetailList = internshipService.getAllByEnterpriseIdSta((int) session.getAttribute("enterpriseId"),Integer.valueOf(status));
            PageInfo pageInfo = new PageInfo(internshipDetailList);
            obj.add("data",pageInfo.getList());
        }
        obj.success();
        return obj;
    }

    /*
    * 企业学生管理
    * */
    @GetMapping("api/enterprise/stumanagelist")
    public Obj stuMg(@RequestParam String exp_id, @RequestParam int page){
        PageHelper.startPage(page,10);
        List<StuApply> applies = applyService.getByExpIdSta(Integer.valueOf(exp_id),4);
        PageInfo pageInfo = new PageInfo(applies);
        obj.add("data",pageInfo.getList());
        obj.success();
        return obj;
    }
}
