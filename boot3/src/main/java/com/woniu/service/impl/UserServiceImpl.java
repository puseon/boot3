package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.UserMapper;
import com.woniu.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(null);
	}

}
