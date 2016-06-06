package com.cnmo.camera.bean;


/**
 * Created by Administrator on 2016/6/3.
 */
public class UserBean extends Entity {
    private String username;
    private String uid;
    private String loginToken;

    public String getUsername() {
        return username;
    }

    public String getUid() {
        return uid;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }
}
