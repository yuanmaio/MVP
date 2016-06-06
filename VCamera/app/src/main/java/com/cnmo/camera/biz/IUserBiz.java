package com.cnmo.camera.biz;

/**
 * Created by ym on 2016/6/3.
 */
public interface IUserBiz {
    public void login(String username,String pwd,String imei, OnLoginListener onLoginListener);
}
