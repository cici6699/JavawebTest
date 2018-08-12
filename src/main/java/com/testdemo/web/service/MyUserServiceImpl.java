package com.testdemo.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testdemo.web.dao.MyUserDao;
import com.testdemo.web.vo.MyUser;

@Service 
public class MyUserServiceImpl  implements MyUserService{

	@Autowired  
	private MyUserDao myUserDao; 
	
	@Override
	public MyUser selectUserByNamePsw(String username, String userpsw) {
		// TODO 自动生成的方法存根
		return myUserDao.selectUserByNamePsw(username, userpsw);
	}

}
