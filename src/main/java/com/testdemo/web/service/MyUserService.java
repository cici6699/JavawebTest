package com.testdemo.web.service;

import com.testdemo.web.vo.MyUser;

/**
 * 功能概要：MyUserService接口类
 * @author ylfxv
 *
 */
public interface MyUserService {
	
	/**
	 * 通过用户名  密码查询
	 * @param username 用户名
	 * @param userpsw 用户密码
	 * @return 返回用户实体，如果数据库中不存在，则返回null
	 */
	MyUser selectUserByNamePsw(String username, String userpsw); 
}
