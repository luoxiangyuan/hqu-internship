package com.hqu.internship.bean;

import java.sql.Timestamp;
import java.util.Date;

public class Enterprise {
    private Integer enterpriseId;

    private String type;

    private String name;

    private String address;

    private String email;

    private String contactName;

    private String contactTel;

    private String intro;

    private String password;

    private Timestamp registerTime;

    private Byte status;

    private String images;

    private String qualificateFile;

    public Enterprise(Integer enterpriseId, String type, String name, String address, String email, String contactName, String contactTel, String intro, String password, Timestamp registerTime, Byte status, String images, String qualificateFile) {
        this.enterpriseId = enterpriseId;
        this.type = type;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contactName = contactName;
        this.contactTel = contactTel;
        this.intro = intro;
        this.password = password;
        this.registerTime = registerTime;
        this.status = status;
        this.images = images;
        this.qualificateFile = qualificateFile;
    }

    public Enterprise() {
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getQualificateFile() {
        return qualificateFile;
    }

    public void setQualificateFile(String qualificateFile) {
        this.qualificateFile = qualificateFile == null ? null : qualificateFile.trim();
    }
}