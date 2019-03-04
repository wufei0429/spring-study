package com.spring.IoC;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//制定配置文件路径
@ContextConfiguration(locations = {"/spring.xml"})
public class UserLoginTest {

    @Autowired
    private User user;

    @Test
    public void userLogin() {
        UserLogin userLogin = new UserLogin();//context.getBean(UserLogin.class);
        assertEquals(true, userLogin.userLogin(user));
    }
}

