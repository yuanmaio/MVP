package com.cnmo.camera.bean;

import java.io.Serializable;

/**
 * 基础类
 * Created by ym on 2016/6/3.
 */
public class Entity<T> implements Serializable{
    private T data;
    private String code;
    private String msg;

    public T getData() {
        return data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
