package com.example.administrator.mvpnews;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.mvpnews.Interfer.IBaseview;

public class MainActivity extends Activity implements IBaseview{
    LoginPresent present = new LoginPresent(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        present.loginToser("","");
    }

    @Override
    public void loginPro() {

    }

    @Override
    public void loginSucess() {

    }

    @Override
    public void loginError() {

    }
}
