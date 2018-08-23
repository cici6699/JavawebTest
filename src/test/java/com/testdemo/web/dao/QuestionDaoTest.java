package com.testdemo.web.dao;

import com.testdemo.web.vo.Question;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(
        locations={"classpath:spring/application-mvc.xml",
                "classpath:spring/application.xml",
                "classpath:mybatis/mybatis-config.xml"
        })

@RunWith(SpringJUnit4ClassRunner.class)
public class QuestionDaoTest {

    @Before
    public void setUp() throws Exception {
    }

    @Autowired
    public QuestionDao testDao;

    @Test
    public void findByTypeId() {
        List<Question> q = testDao.findByTypeId(6);
        Assert.assertNotNull(q);
    }

    @Test
    public void findByQuestionId() {
        Question q = testDao.findByQuestionId(1);
        Assert.assertEquals(1,q.getQustionId());
    }
}