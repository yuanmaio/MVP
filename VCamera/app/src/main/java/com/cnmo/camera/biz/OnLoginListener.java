package com.cnmo.camera.biz;

import com.cnmo.camera.bean.UserBean;

/**
 * Created by Administrator on 2016/6/3.
 */
public interface OnLoginListener extends OnResponseListener<UserBean> {
    void success(UserBean userBean);
}
