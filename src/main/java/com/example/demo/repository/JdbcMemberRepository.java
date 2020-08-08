package com.example.demo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import com.example.demo.domain.Member;

public class JdbcMemberRepository implements MemberRepository{

	private final DataSource dataSource;
	
	public JdbcMemberRepository(DataSource datasource) {
		this.dataSource = datasource;
	}

	@Override
	public Member save(Member member) {
		String sql = "isert into member(name) values ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		return null;
	}

	@Override
	public Optional<Member> findById(Long idLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
