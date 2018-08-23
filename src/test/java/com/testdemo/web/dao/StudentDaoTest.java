package com.testdemo.web.dao;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.testdemo.web.vo.Student;

@ContextConfiguration(
		locations={"classpath:spring/application-mvc.xml",
                   "classpath:spring/application.xml",
                   "classpath:mybatis/mybatis-config.xml"
        })

@RunWith(SpringJUnit4ClassRunner.class)
public class StudentDaoTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Autowired
	public StudentDao testDao;
	
	/*
	@Test
	public void testFindById() {
		Student s=testDao.findById(1);
		Assert.assertNotNull(s);
		Assert.assertEquals(1, s.getUserId());
		System.out.println(s);
		
	}*/
	@Test
	public void testFindByName()
	{
		Student s=testDao.findByName("klaus");
		Assert.assertNotNull(s);
		Assert.assertEquals("klaus", s.getUserName());
		System.out.println(s.getUserName());
	}
}
