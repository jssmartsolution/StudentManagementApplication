package com.vs.service;

import java.util.List;

import com.vs.dto.StudentDTO;

public interface IStudentService {
	
	List<StudentDTO> selectStudentList();

}
