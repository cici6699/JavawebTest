package com.testdemo.web.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 

import com.testdemo.web.dao.MyUserDao;
import com.testdemo.web.vo.MyUser;

@ContextConfiguration(
		locations={"classpath:spring/application-mvc.xml",
				   "classpath:spring/application.xml",
				   "classpath:mybatis/mybatis-config.xml"
			})
@RunWith(SpringJUnit4ClassRunner.class) 
public class MyUserServiceImplTest {

	/**
	 * 模拟被测试对象调用的Mock Dao 对象.
	 */
	@Mock
	private MyUserDao myUserDao;
	
	@InjectMocks
	private MyUserService myUserService = 
			new MyUserServiceImpl();
	@Spy
	private MyUser myUser;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSelectUserByNamePsw() {
		//fail("Not yet implemented");
		myUser.setUserId(1);
		myUser.setUserName("1");
		myUser.setUserPassword("dsaf");
		myUser.setUserEmail("aaad");
		
		Mockito.when(myUserDao.selectUserByNamePsw("1", "dsaf"))
				.thenReturn(myUser);
		
		MyUser actUser = myUserService.selectUserByNamePsw("1", "dsaf");
		
		Assert.assertEquals(actUser, myUser);
		
		Mockito.verify(myUserDao)
		.selectUserByNamePsw("1", "dsaf");
	}

}
