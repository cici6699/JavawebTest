package com.testdemo.web.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.testdemo.web.vo.MyUser;
import junit.framework.Assert;

@ContextConfiguration(locations={"classpath:spring/application-mvc.xml",
"classpath:spring/application.xml",
"classpath:mybatis/mybatis-config.xml",
"classpath:mybatis/web/UserDao.xml"})
 
@RunWith(SpringJUnit4ClassRunner.class)

public class MyUserServiceTest {

	@Autowired  
    private MyUserService myUserService;  
      
    @Test   
    public void testSelectUserByNamePsw(){  
        MyUser selectUser = myUserService.selectUserByNamePsw("evan", "123");
        Assert.assertEquals(null, selectUser);
//        Assert.assertEquals("evan", selectUser.getUserName());
//		Assert.assertEquals("123", selectUser.getUserPassword());
//		
//		selectUser = myUserService.selectUserByNamePsw("222", "123");
//		Assert.assertEquals(null, selectUser);
       
    }
    
	@Before
	public void setUp() throws Exception {
	}

}
