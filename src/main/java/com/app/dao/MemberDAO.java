package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.myBatis.config.MyBatisConfig;
import com.app.vo.MemberVO;

public class MemberDAO {
	
	public SqlSession sqlSession;
	
	// 생성자
	// 코드가 반복되지 않도록 기능들로 정의해놓은 것
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(MemberVO memberVO) {
		sqlSession.insert("member.insert", memberVO);
	}
	
	public String select(MemberVO memberVO) {
		return sqlSession.selectOne("member.select", memberVO);
	}
	
	
	
}
