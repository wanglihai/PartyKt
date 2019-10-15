package com.ole.life.config;

import com.ole.life.contant.ServerCode;
import com.ole.life.http.model.ApiResult;


public class CustomApiResult<T> extends ApiResult<T> {
    String msg;
    int code;
    T data;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        code = code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public void setMsg(String msg) {
        msg = msg;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        data = data;
    }

    @Override
    public boolean isOk() {
        if (code == ServerCode.CODE_SUCCESS) {
            return true;
        } else if (code == ServerCode.TOKEN_ERROR || code == ServerCode.IDENTITY_ERROR) {
            // TODO: 2019/10/15 去登陆页面重新登陆
            return false;
        }
        return false;
    }
}
