package com.cnmo.camera.biz;


import android.util.Log;

import com.cnmo.camera.common.URLs;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Request;

/**
 * Created by Administrator on 2016/6/3.
 */
public class UserBiz implements IUserBiz {
    @Override
    public void login(String username, String pwd,String imei,final  OnLoginListener onLoginListener) {
      // apiClient
//        String imei = StringUtils.getmei(this);
        long timestamp = URLs.gettimestamp();
        String token = URLs.gettoken(timestamp, "");
      String url=  URLs.LOGIN += "token=" + token + "&timestamp=" + timestamp;
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("username",username);
        hashmap.put("password",pwd);
        hashmap.put("deviceid",imei);
       OkHttpUtils.post().url(url).params(hashmap).build()
               .execute(new StringCallback()
               {
                   @Override
                   public void onError(Call call, Exception e, int id) {
                       Log.d("error",e.toString());
                       onLoginListener.fail();
                   }

                   @Override
                   public void onResponse(String response, int id) {
                       Log.d("response",response);
                   }

               });

    }
}
