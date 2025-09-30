package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.ProductVO;

public class ProductDAO {
	
	public SqlSession sqlSession;
	
	// 생성자
	// 코드가 반복되지 않도록 기능들로 정의해놓은 것
	public ProductDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(ProductVO productVO) {
		sqlSession.insert("product.insert", productVO);
	}
}
