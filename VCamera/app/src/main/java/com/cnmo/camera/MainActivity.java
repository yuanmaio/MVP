package com.cnmo.camera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cnmo.camera.common.StringUtils;
import com.cnmo.camera.presenter.UserLoginPresenter;
import com.cnmo.camera.view.IUserLoginView;

public class MainActivity extends AppCompatActivity implements IUserLoginView {
   private Button btn_;
    private UserLoginPresenter userLoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_= (Button) findViewById(R.id.main_btn);
        userLoginPresenter=new UserLoginPresenter(this);
        btn_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLoginPresenter.login();
            }
        });
    }

    @Override
    public String getusername() {
        return "13051735295";
    }

    @Override
    public String getpwd() {
        return "a123456";
    }

    @Override
    public String getimei() {
        return StringUtils.getmei(this);
    }
}
