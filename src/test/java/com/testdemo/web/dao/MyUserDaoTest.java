package com.testdemo.web.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 

import com.testdemo.web.vo.MyUser;

@ContextConfiguration(
		locations={"classpath:spring/application-mvc.xml",
                   "classpath:spring/application.xml",
                   "classpath:mybatis/mybatis-config.xml"
        })

@RunWith(SpringJUnit4ClassRunner.class)
public class MyUserDaoTest {
	
	@Autowired
	private MyUserDao myUserDao;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSelectUserByNamePsw() {
		MyUser myUser = myUserDao.selectUserByNamePsw("1", "dsaf");
		Assert.assertEquals(myUser, null);
		//		Assert.assertEquals("1", myUser.getUserName());
//		Assert.assertEquals("dsaf", myUser.getUserPassword());
//		myUser = myUserDao.selectUserByNamePsw("2", "222");
//		Assert.assertEquals(null, myUser);
	}

}
