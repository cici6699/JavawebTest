package com.testdemo.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.testdemo.web.vo.User;

/** 
* 功能概要：User的DAO类 
*  
* @author huizhuo
* @since 2015年9月28日 
*/  
public interface UserDao {  
   /** 
    *  
    * @author huizhuo 
    * @since 2015年9月28日 
    * @param userId 
    * @return 
    */  
   public User selectUserByNamePsw(@Param("user_name") String name,
		   @Param("user_password") String psw);   
   public int update(User u);
   public int insert(User u);
   public int delete(@Param("user_id") Integer id);
   public List<User> list(@Param("user_name") String name);
 
}  