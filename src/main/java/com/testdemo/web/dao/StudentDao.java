package com.testdemo.web.dao;

import org.apache.ibatis.annotations.Param;

import com.testdemo.web.vo.Student;

public interface StudentDao {
	Student findById(@Param("userId") int userId); 
	Student findByName(@Param("userName") String userName);
}
