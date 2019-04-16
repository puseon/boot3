package com.woniu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.TeacherMapper;
@Service
public class TeacherServiceImpl implements TeacherService {

	@Resource
	private TeacherMapper teacherMapper;
	
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return teacherMapper.selectByExample(null);
	}

}
