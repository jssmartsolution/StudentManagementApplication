package com.vs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vs.dto.StudentDTO;

public class StudentRowMapper implements RowMapper<StudentDTO> {

	public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDTO studentDTO= new StudentDTO();
		studentDTO.setId(rs.getInt("ID"));
		studentDTO.setName(rs.getString("NAME"));
		studentDTO.setMobile(rs.getLong("MOBILE"));
		studentDTO.setCountry(rs.getString("COUNTRY"));
		return studentDTO;
	}

	/*public Object mapRow(ResultSet rs, int rowCount) throws SQLException {
		
	}*/

}
