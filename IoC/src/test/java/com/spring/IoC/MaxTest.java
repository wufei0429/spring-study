package com.spring.IoC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

import static org.junit.Assert.*;
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//制定配置文件路径
@ContextConfiguration(locations = {"/spring.xml"})
public class MaxTest {

    //自动注入max
    @Autowired
    private Max max;

    @Test
    public void getMax() {
        assertEquals(5,max.getMax());
    }

}