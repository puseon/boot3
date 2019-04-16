package com.woniu.service;

import java.util.List;

import com.woniu.entity.UCKey;

public interface IUCKeyService {
	void save(UCKey uCKey);
	void update(UCKey uCKey);
	void delete(UCKey uCKey);
	List findAll();
	UCKey findByid(UCKey uCKey);
}
