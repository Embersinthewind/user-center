package com.yiyu.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新用户请求体
 */
@Data
public class UserUpdateRequest implements Serializable {
    private Long id;
    private String userName;
    private Integer userRole;

}