package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.StringJoiner;

import static org.junit.Assert.*;
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//制定配置文件路径
@ContextConfiguration(locations = {"/user.xml"})
public class UserDAOImplTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    public void insert() {
        userDAO.insert();

    }



}