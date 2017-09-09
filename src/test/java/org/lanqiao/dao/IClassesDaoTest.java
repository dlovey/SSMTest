package org.lanqiao.dao;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springMybatis.xml"})
public class IClassesDaoTest {


    @Autowired
    IClassesDao classesDao;
    @Test
    public void getAllClassesInfo() throws Exception {
        System.out.println(classesDao.getAllClassesInfo());
    }

    @Test
    public void getClassesInfoById() throws Exception {
        System.out.println(classesDao.getClassesInfoById(1701));
    }
}