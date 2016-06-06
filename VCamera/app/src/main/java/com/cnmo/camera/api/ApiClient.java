package com.cnmo.camera.api;

/**
 * Created by ym on 2016/6/3.
 */
public class ApiClient {
    private static volatile ApiClient instance = null;

    public ApiClient() {

    }

    public static ApiClient getInstance() {
        if (instance == null) {
            synchronized (ApiClient.class) {
                instance = new ApiClient();
            }
        }
        return instance;
    }
}
