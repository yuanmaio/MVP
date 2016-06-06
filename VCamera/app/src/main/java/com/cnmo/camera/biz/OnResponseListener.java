package com.cnmo.camera.biz;

/**
 * Created by Administrator on 2016/6/3.
 */
public interface OnResponseListener<T> {
    void success(T t);
    void fail();


}
