package com.vs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vs.dto.StudentDTO;
import com.vs.mapper.StudentRowMapper;

@Repository
public class IStudentDAOImpl implements IStudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<StudentDTO> studentList() {
		
		String sql="SELECT * FROM STUDENTS";
		System.out.println("comes in IStudentDAOImpl >>>>>>>>>>>>>>>");
		List<StudentDTO> studentList=jdbcTemplate.query(sql, new StudentRowMapper());
		System.out.println("------- In DAO IMP >>>"+studentList);
		
		return studentList ;
	}

}
