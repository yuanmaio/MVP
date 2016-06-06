package com.cnmo.camera.presenter;

import com.cnmo.camera.bean.UserBean;
import com.cnmo.camera.biz.IUserBiz;
import com.cnmo.camera.biz.OnLoginListener;
import com.cnmo.camera.biz.UserBiz;
import com.cnmo.camera.view.IUserLoginView;

/**
 * Created by Administrator on 2016/6/3.
 */
public class UserLoginPresenter {
    private IUserBiz IuserBiz;
    private IUserLoginView userLoginView;
    public UserLoginPresenter(){

    }
    public UserLoginPresenter(IUserLoginView userLoginView){
        this.IuserBiz=new UserBiz();
        this.userLoginView=userLoginView;
    }
    public void login(){
        IuserBiz.login(userLoginView.getusername(), userLoginView.getpwd(),userLoginView.getimei(), new OnLoginListener() {
            @Override
            public void success(UserBean userBean) {

            }

            @Override
            public void fail() {

            }
        });
    }
}
