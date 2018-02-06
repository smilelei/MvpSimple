package com.example.administrator.mvpnews;

import com.example.administrator.mvpnews.Interfer.IBaseMode;
import com.example.administrator.mvpnews.Interfer.IBasePresent;

/**
 * Created by Administrator on 2018/2/2.
 */

public class LoginModel implements IBaseMode{
    IBasePresent present;
    LoginModel(IBasePresent present){
        this.present = present;
    }
    @Override
    public void login(String name, String password) {
        if(name=="admin"&&password=="123ee"){
            present.loginSucess();
        }else{
            present.loginError();
        }

    }
}
