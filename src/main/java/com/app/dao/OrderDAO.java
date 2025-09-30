package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;

public class OrderDAO {
	
	public SqlSession sqlSession;
	
	// 생성자
	// 코드가 반복되지 않도록 기능들로 정의해놓은 것
	public OrderDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
}
