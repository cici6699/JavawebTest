package com.testdemo.web.service;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testdemo.web.dao.UserDao;
import com.testdemo.web.vo.User;
 
 
/** 
 * 功能概要：UserService实现类 
 *  
 * @author huizhuo 
 * @since  2017年8月28日  
 */  
@Service 
public class UserServiceImpl implements UserService{  
    @Autowired  
    private UserDao userDao;   

 
    
	@Override
	public int deleteUser(int id) {
		return userDao.delete(id); 
	} 
	
	@Override
	public int insertUser(User user) {
		userDao.insert(user);
		return 0;
	}  
 
	@Override
	public User selectUserByNamePsw(String username, String userpsw) {
		return userDao.selectUserByNamePsw(username, userpsw);
	}

	@Override
//	@Transactional(propagation=Propagation.REQUIRED, 
//	 isolation=Isolation.READ_COMMITTED, 
//	 readOnly=false,
//	 rollbackFor=Exception.class)   
	public int updateUser(User user) {		 
		return userDao.update(user);
	}  
}  