package com.vs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.dao.IStudentDAO;
import com.vs.dto.StudentDTO;

@Service
public class IStudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDAO iStudentDAOImpl;
	public List<StudentDTO> selectStudentList() {
		System.out.println("comes in iStudentDAOImpl >>>. ");
		List<StudentDTO> studentList = iStudentDAOImpl.studentList();
		System.out.println("-----In Service IMPL >>>>"+studentList);
		return studentList;
	}

}
