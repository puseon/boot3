package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.CategoryMapper;
import com.woniu.service.ICategoryService;
@Service
public class CategoryServiceImpl implements ICategoryService {
	@Resource
	private CategoryMapper categoryMapper;
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return categoryMapper.selectByExample(null);
	}

}
