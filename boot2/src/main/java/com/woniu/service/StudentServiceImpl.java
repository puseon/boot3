package com.woniu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Student;
import com.woniu.mapper.StudentMapper;
@Service
public class StudentServiceImpl implements IService {
	@Resource
	private StudentMapper studentMapper;
	
	
	@Override
	public void save(Student student) {
		studentMapper.insert(student);

	}

	@Override
	public void update(Student student) {
		studentMapper.updateByPrimaryKey(student);
	}

	@Override
	public void delete(Integer stid) {
		studentMapper.deleteByPrimaryKey(stid);
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return studentMapper.selectByExample(null);
	}

	@Override
	public Student findById(Integer stid) {
		return studentMapper.selectByPrimaryKey(stid);
	}

}
