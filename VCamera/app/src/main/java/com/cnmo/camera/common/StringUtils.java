package com.cnmo.camera.common;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;

/**
 * Created by Administrator on 2016/6/3.
 */
public class StringUtils {

    // 获得imei码
    public static String getmei(Context context) {
        String imei;
        imei = ((TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
        if(imei==null || imei.equals("")) {
            imei = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        }

        return imei;

    }
}
