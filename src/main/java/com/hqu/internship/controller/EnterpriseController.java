package com.hqu.internship.controller;

import com.hqu.internship.bean.*;
import com.hqu.internship.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 企业相关api
 * */

@RestController
@RequestMapping("/api/enterprise")
public class EnterpriseController {

  @Autowired UploadFileService uploadFileService;

  @Autowired EnterpriseService enterpriseService;

  @Autowired InternshipService internshipService;

  @Autowired Obj obj;

  @Autowired ApplyService applyService;

  @Autowired AchievementService achievementService;
  /*
   * 企业注册请求
   * */
  @PostMapping("/register")
  public Obj regist(@RequestBody MultipartFile[] uploadFiles, HttpServletRequest req) {
    String email = req.getParameter("email");
    List<Enterprise> enterpriseList = enterpriseService.allEnterprise();
    for (Enterprise nowEnterprise : enterpriseList) { // 判断数据库中有无相同email
      if (nowEnterprise.getEmail() == email) {
        obj.setMsg("该邮箱已注册！");
        break;
      }
    }
    if (!obj.getMsg().equals("该邮箱已注册！")) { // 如果不存在相同email则注册
      String password = req.getParameter("password");
      String md5Password = DigestUtils.md5DigestAsHex(password.getBytes()); // 密码进行md5加密
      Timestamp registTime = new Timestamp(new Date().getTime()); // 获取当前时间戳
      byte status = 0; // 公司注册审核状态为0，即未审核
      ArrayList images = new ArrayList();
      ArrayList qualificate_file = new ArrayList();
      /*
       * 遍历传入文件
       * */
      for (int i = 0; i < uploadFiles.length; i++) {
        String fileName = uploadFiles[i].getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        /*
         * 判断传入文件为图片还是zip，分别处理
         * */
        if (fileType.equals(".png")
            || fileType.equals(".jpg")
            || fileType.equals(".PNG")
            || fileType.equals(".JPG")) {
          String path = new String("enterprise/" + email + "/images");
          images.add(uploadFileService.upload(uploadFiles[i], path, req)); // 上传文件，返回文件地址
        } else if (fileType.equals(".zip") || fileType.equals(".ZIP")) {
          String path = new String("enterprise/" + email + "/qualificate_file");
          qualificate_file.add(uploadFileService.upload(uploadFiles[i], path, req)); // 上传文件，返回文件地址
        }
      }

      /*
       * 创建enterprise对象，设置属性
       * */
      Enterprise newEnterprise = new Enterprise();
      newEnterprise.setEmail(req.getParameter("email"));
      newEnterprise.setPassword(md5Password);
      newEnterprise.setAddress(req.getParameter("address"));
      newEnterprise.setContactName(req.getParameter("contact_name"));
      newEnterprise.setContactTel(req.getParameter("contact_tel"));
      newEnterprise.setImages(images.toString());
      newEnterprise.setIntro(req.getParameter("intro"));
      newEnterprise.setName(req.getParameter("name"));
      newEnterprise.setQualificateFile(qualificate_file.toString());
      newEnterprise.setRegisterTime(registTime);
      newEnterprise.setStatus(status);
      newEnterprise.setType(req.getParameter("type"));
      enterpriseService.InsertEnterprise(newEnterprise);
      obj.success();
    }
    return obj;
  }

  /*
   * 登录接口实现
   * */
  @PostMapping("/login")
  public Obj login(@RequestBody String email, @RequestBody String password, HttpSession session) {
    Enterprise enterprise = enterpriseService.selectByEmail(email);
    if (enterprise == null) {
      obj.setMsg("用户不存在！");
    } else {
      if (password == enterprise.getPassword()) {
        obj.setMsg("处理成功");
        obj.setCode("200");
        session.setAttribute("enterpriseId", enterprise.getEnterpriseId());
      } else {
        obj.setMsg("密码错误！");
      }
    }
    return obj;
  }

  /*
   * 发布实训接口
   * */
  @PostMapping("/internship")
  public Obj pubExp(HttpSession session, HttpServletRequest req) {
    // session.setAttribute("enterpriseId",1);
    int enterpriseId = (int) session.getAttribute("enterpriseId");

    Enterprise thisEnterprise = enterpriseService.getByPk(enterpriseId);
    if (thisEnterprise.getStatus() == 1) { // 判断企业是否通过审核，通过审核才可以发布实训
      byte status = 0;
      Timestamp submitTime = new Timestamp(new Date().getTime());
      Timestamp modifyTime = new Timestamp(new Date().getTime());

      /*
       * 设置internship属性
       * */
      InternshipDetail newInternship = new InternshipDetail();
      newInternship.setApplyEndTime(Timestamp.valueOf(req.getParameter("apply_end_time")));
      newInternship.setDescription(req.getParameter("description"));
      newInternship.setEnterpriseId(enterpriseId);
      newInternship.setExpBeginTime(Timestamp.valueOf(req.getParameter("exp_begin_time")));
      newInternship.setExpEndTime(Timestamp.valueOf(req.getParameter("exp_end_time")));
      newInternship.setExpModifyTime(modifyTime);
      newInternship.setNeedNum(Integer.valueOf(req.getParameter("need_num")));
      newInternship.setStatus(status);
      newInternship.setSubmitTime(submitTime);
      newInternship.setTopic(req.getParameter("topic"));

      internshipService.insertIntership(newInternship);
      obj.success();
    } else {
      obj.setMsg("企业未通过审核，不可发布实训！");
    }

    return obj;
  }

  /*
   * 删除实训接口
   * */
  @DeleteMapping("/internship")
  public Obj delExp(@RequestParam int expId) {
    internshipService.delInternshipById(expId);
    obj.success();
    return obj;
  }

  /*
   * 修改实训接口
   * */
  @PutMapping("/internship")
  public Obj updateExp(HttpServletRequest req) {
    InternshipDetail internshipDetail =
        internshipService.getByPk(Integer.valueOf(req.getParameter("expId")));

    if (internshipDetail.getStatus() == 2) { // 判断实训是否通过审核，如果通过审核不可修改
      obj.setMsg("不可修改已通过审核的实训信息");
    } else {
      InternshipDetail updateInternship = new InternshipDetail();
      updateInternship.setInternshipId(Integer.valueOf(req.getParameter("expId")));
      updateInternship.setApplyEndTime(Timestamp.valueOf(req.getParameter("apply_end_time")));
      updateInternship.setDescription(req.getParameter("description"));
      updateInternship.setExpBeginTime(Timestamp.valueOf(req.getParameter("exp_begin_time")));
      updateInternship.setExpEndTime(Timestamp.valueOf(req.getParameter("exp_end_time")));
      updateInternship.setExpModifyTime(new Timestamp(new Date().getTime()));
      updateInternship.setNeedNum(Integer.valueOf(req.getParameter("need_num")));
      updateInternship.setTopic(req.getParameter("topic"));
      internshipService.updateByPkSelective(updateInternship);
      obj.success();
    }
    return obj;
  }

  /*
   * 查询实训信息接口
   * */
  @GetMapping("/internship")
  public Obj getExp(@RequestParam int expId) {
    InternshipDetail getInternship = internshipService.getByPk(expId);
    ArrayList data = new ArrayList();
    data.add(getInternship);
    obj.add("data", data);
    obj.success();
    return obj;
  }

  /*
   * 查询企业信息
   * */
  @GetMapping("/detail")
  public Obj getDetail(HttpSession session) {
    // session.setAttribute("enterpriseId",1);
    int enterpriseId = (int) session.getAttribute("enterpriseId");
    Enterprise nowEnterprise = enterpriseService.getByPk(enterpriseId);
    nowEnterprise.setPassword("密码你猜");
    ArrayList data = new ArrayList();
    data.add(nowEnterprise);
    obj.add("data", data);
    obj.success();
    return obj;
  }

  /*
   * 处理申请
   * */
  @PutMapping("/application")
  public Obj dealAp(HttpServletRequest req) {
    StuApply stuApply = new StuApply();
    stuApply.setApplyId(Integer.valueOf(req.getParameter("apply_id")));
    stuApply.setApplyStatus(Byte.valueOf(req.getParameter("apply_status")));
    applyService.updateById(stuApply);
    obj.success();
    return obj;
  }

  /*
   * 发布结业结果,上传结业证明
   * */
  @PostMapping("/result/certificate")
  public Obj pubCertificate(MultipartFile[] multipartFiles, HttpServletRequest req) {
    int expId = Integer.valueOf(req.getParameter("exp_id"));
    String filePath = new String();
    for (int i = 0; i < multipartFiles.length; i++) {
      String path = "achievement/" + expId;
      filePath = uploadFileService.upload(multipartFiles[i], path, req);
    }

    List<StuApply> applies = applyService.getByExpId(expId);
    for (StuApply apply : applies) {
      StuAchievement achievement = achievementService.getByApplyId(apply.getApplyId());
      StuAchievement newAchievement = new StuAchievement();
      newAchievement.setId(achievement.getId());
      newAchievement.setCertificate(filePath);
      achievementService.updateByPk(newAchievement);
    }
    obj.success();
    return obj;
  }

  /*
  * 上传实训成绩
  * */
  @PostMapping("/result/mark")
  public Obj pubMark(HttpServletRequest req){
    StuAchievement achievement = achievementService.getByApplyId(Integer.valueOf(req.getParameter("apply_id")));
    achievement.setMark(req.getParameter("mark"));
    achievementService.updateByPk(achievement);
    obj.success();
    return obj;
  }


}
