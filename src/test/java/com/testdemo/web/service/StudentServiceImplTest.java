package com.testdemo.web.service;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.testdemo.web.dao.StudentDao;
import com.testdemo.web.vo.Student;

import junit.framework.Assert;
@ContextConfiguration(
		locations={"classpath:spring/application-mvc.xml",
                   "classpath:spring/application.xml",
                   "classpath:mybatis/mybatis-config.xml"
        })
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceImplTest {
	//单元测试
	@Mock
	public StudentDao dao;
	
	@InjectMocks
	//@Autowired
	public StudentServiceImpl service=new StudentServiceImpl();
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFindById() {
		Student stu = new Student();
		stu.setUserId(6);
		stu.setUserName("Reinherz");
		stu.setUserAge(20);
		Mockito.when(dao.findById(6)).thenReturn(stu);
		Student act=service.findById(6);
		Assert.assertEquals("Reinherz", act.getUserName());
	}
}
