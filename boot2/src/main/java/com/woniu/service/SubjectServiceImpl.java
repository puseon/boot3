package com.woniu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.SubjectMapper;
@Service
public class SubjectServiceImpl implements SubjectService {

	@Resource
	private SubjectMapper subjectMapper;
	
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return subjectMapper.selectByExample(null);
	}

}
