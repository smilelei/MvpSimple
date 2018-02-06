package com.example.administrator.mvpnews;

import com.example.administrator.mvpnews.Interfer.IBasePresent;
import com.example.administrator.mvpnews.Interfer.IBaseview;

/**
 * Created by Administrator on 2018/2/2.
 */

public class LoginPresent implements IBasePresent{
    LoginModel loginModel = new LoginModel(this);
    IBaseview iBaseview;
    LoginPresent(IBaseview baseview){
        this.iBaseview = baseview;
    }
    @Override
    public void loginToser(String name, String password) {
        loginModel.login(name,password);
        iBaseview.loginPro();
    }

    @Override
    public void loginSucess() {
        iBaseview.loginSucess();

    }

    @Override
    public void loginError() {
        iBaseview.loginError();

    }
}
