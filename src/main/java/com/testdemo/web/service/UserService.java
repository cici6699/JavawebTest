package com.testdemo.web.service;
  
import com.testdemo.web.vo.User; 
/** 
 * 功能概要：UserService接口类 
 *  
 * @author huizhuo 
 * @since  2015年9月28日  
 */  
public interface UserService {  
    User selectUserByNamePsw(String username, String userpsw);   
    int deleteUser(int id);
    int insertUser(User user); 
    int updateUser(User user);
}  