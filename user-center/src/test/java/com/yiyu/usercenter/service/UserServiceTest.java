package com.yiyu.usercenter.service;

import com.yiyu.usercenter.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();

        user.setUsername("yiyu");
        user.setAvatarUrl("https://baomidou.com/img/logo.svg");
        user.setGender(0);
        user.setUserAccount("147");
        user.setUserPassword("555");
        user.setPhone("123");
        user.setEmail("123");
        user.setUserStatus(0);

        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);

    }


    @Test
    void userRegister() {
        String userAccount = "yiyu";
        String userPassword = "";
        String checkPassword = "123456";
        String playerCode = "1";

        //非空
        long result = userService.userRegister(userAccount, userPassword, checkPassword, playerCode);
        Assert.assertEquals(-1, result);

        //账号长度
        userAccount = "yi";
        result = userService.userRegister(userAccount, userPassword, checkPassword, playerCode);
        Assert.assertEquals(-1, result);

        //密码长度
        userAccount = "yiyu";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword, playerCode);
        Assert.assertEquals(-1, result);

        //密码，校验密码相同
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, playerCode);
        Assert.assertEquals(-1, result);

        //帐号不重复
        userAccount = "yiyu";
        result = userService.userRegister(userAccount, userPassword, checkPassword, playerCode);
        Assert.assertEquals(-1, result);

        //插入数据库
        userAccount = "dogyiyu";
        userPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, playerCode);
        Assertions.assertTrue(result > 0);
    }
}