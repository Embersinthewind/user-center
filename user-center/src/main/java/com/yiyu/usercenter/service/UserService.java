package com.yiyu.usercenter.service;

import com.yiyu.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;


import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 * @author yiyu
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @param playerCode
     * @return
     */

    long userRegister(String userAccount, String userPassword, String checkPassword,String playerCode);

    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @return
     */
    User userLogin(String userAccount, String userPassword,HttpServletRequest request);

    /**
     * 移除登录态
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);


    /**
     * 编辑后修改用户
     * @param id
     * @param userName
     * @param userRole
     * @return返回修改的用户id
     */
    Long updateUser( Long id,String userName,Integer userRole);


    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);


}
