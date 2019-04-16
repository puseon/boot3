package com.woniu.service;

import java.util.List;

import com.woniu.entity.Student;


public interface IService {
	void save(Student student);
	void update(Student student);
	void delete(Integer stid);
	List findAll();
	Student findById(Integer stid);
}
