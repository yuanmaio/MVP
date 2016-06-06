package com.cnmo.camera.common;

/**
 * Created by Administrator on 2016/6/3.
 */
public class URLs {
    public static String BASE = "http://dev.api.cnmo.com/index.php?c=Index&appid=4001&";
    public static String movie="";
    public static String LOGIN= BASE
            + "apic=Member_Login&v=1.0&format=json&charset=gbk&";
    public static long gettimestamp(){
        return System.currentTimeMillis()/1000;
    }
    public static String gettoken(long timestamp, String ukey) {
        String token = Tools.md5(Tools.md5(Constant.id2 + Constant.key)
                .substring(0, 8) + timestamp + ukey);
        return token;
    }

}
