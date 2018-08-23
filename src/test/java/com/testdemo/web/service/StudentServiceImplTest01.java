package com.testdemo.web.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.testdemo.web.vo.Student;

import junit.framework.Assert;
@ContextConfiguration(
		locations={"classpath:spring/application-mvc.xml",
                   "classpath:spring/application.xml",
                   "classpath:mybatis/mybatis-config.xml"
        })
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceImplTest01 {
	//集成测试
	@Autowired
	public StudentService service;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindById() {
		Student act=service.findById(1);
		System.out.println(act);
		//Assert.assertEquals(8, act.getUserAge());
		act=service.findById(6);
		//Assert.assertEquals(8, act.getUserAge());
	}

}
