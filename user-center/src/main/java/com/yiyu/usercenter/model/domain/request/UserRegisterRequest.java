package com.yiyu.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {
    //继承-序列化
    private static final long serialVersionUID = 163366831741296427L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String playerCode;

}
