package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.UCKey;
import com.woniu.mapper.UCMapper;
import com.woniu.service.IUCKeyService;
@Service
public class UCKeyServiceImpl implements IUCKeyService {
	@Resource
	private UCMapper uCMapper;
	
	@Override
	public void save(UCKey uCKey) {
		uCMapper.insert(uCKey);
	}

	@Override
	public void update(UCKey uCKey) {
		uCMapper.updateByExample(uCKey, null);
	}

	@Override
	public void delete(UCKey uCKey) {
		uCMapper.deleteByPrimaryKey(uCKey);
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return uCMapper.selectByExample(null) ;
	}

	@Override
	public UCKey findByid(UCKey uCKey) {
		// TODO Auto-generated method stub
		return uCMapper.selectByid(uCKey);
	}

	

}
