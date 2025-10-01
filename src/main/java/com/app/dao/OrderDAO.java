package com.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.app.dto.OrderDTO;
import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.OrderVO;

public class OrderDAO {
	
	public SqlSession sqlSession;
	
	// 생성자
	// 코드가 반복되지 않도록 기능들로 정의해놓은 것
	public OrderDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(OrderVO orderVO) {
		sqlSession.insert("order.insert", orderVO);
	}

	public List<OrderDTO> selectAll(Long id) {
		return sqlSession.selectList("order.selectAll", id);
	}
	
	public List<OrderDTO> select(Long memberId, Long orderId) {
		return sqlSession.selectList("order.selectAll", memberId, orderId);
	}
	

	
}
