package com.hqu.internship.bean;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class Obj {
    private String msg="处理失败";
    private String code="100";
    private Map<String, Object> extend = new HashMap<String, Object>();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public void success(){
        this.code = "200";
        this.msg = "处理成功！";
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public Obj add(String key,Object value) {
        this.getExtend().put(key, value);
        return this;
    }
}
