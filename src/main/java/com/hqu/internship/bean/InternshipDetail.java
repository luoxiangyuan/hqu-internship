package com.hqu.internship.bean;

import java.util.Date;

public class InternshipDetail {
    private Integer internshipId;

    private String topic;

    private Integer enterpriseId;

    private String description;

    private Byte status;

    private Integer needNum;

    private Date expEndTime;

    private Date submitTime;

    private Date applyEndTime;

    private Date expModifyTime;

    private Date expBeginTime;

    public Integer getInternshipId() {
        return internshipId;
    }

    public void setInternshipId(Integer internshipId) {
        this.internshipId = internshipId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getNeedNum() {
        return needNum;
    }

    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }

    public Date getExpEndTime() {
        return expEndTime;
    }

    public void setExpEndTime(Date expEndTime) {
        this.expEndTime = expEndTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getApplyEndTime() {
        return applyEndTime;
    }

    public void setApplyEndTime(Date applyEndTime) {
        this.applyEndTime = applyEndTime;
    }

    public Date getExpModifyTime() {
        return expModifyTime;
    }

    public void setExpModifyTime(Date expModifyTime) {
        this.expModifyTime = expModifyTime;
    }

    public Date getExpBeginTime() {
        return expBeginTime;
    }

    public void setExpBeginTime(Date expBeginTime) {
        this.expBeginTime = expBeginTime;
    }
}