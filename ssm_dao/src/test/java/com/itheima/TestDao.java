package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author Bright·King
 * @version 1.0
 * @date 2020/9/28 18:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestDao {
    @Autowired
    private ItemsDao itemsDao;
    @Test
    public void test1() {
        System.out.println(itemsDao.findAll());

    }
}

