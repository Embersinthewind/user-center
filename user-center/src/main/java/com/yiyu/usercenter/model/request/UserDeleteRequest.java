package com.yiyu.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除用户请求体
 */
@Data
public class UserDeleteRequest implements Serializable {
    private static final long serialVersionUID = 8184842984693162160L;

    /**
     * 用户ID
     */
    private Long id;

}
