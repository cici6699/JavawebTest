package com.testdemo.web.dao;

import org.apache.ibatis.annotations.Param;

import com.testdemo.web.vo.MyUser;

public interface MyUserDao {
	/**
	 * 通过用户名  密码查询
	 * @param name 用户名
	 * @param psw 密码
	 * @return 返回用户实体，如果数据库中不存在，则返回null
	 */
	public MyUser selectUserByNamePsw(@Param("name") String name,
			   @Param("psw") String psw);  
}
