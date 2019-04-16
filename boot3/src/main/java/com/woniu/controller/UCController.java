package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.woniu.entity.UCKey;
import com.woniu.service.ICategoryService;
import com.woniu.service.IUCKeyService;
import com.woniu.service.IUserService;

@Controller
public class UCController {
	
	@Resource
	private IUCKeyService uCKeyServiceImpl;
	@Resource
	private ICategoryService iCategoryService;
	@Resource
	private IUserService iUserService;
	@GetMapping(value = "uc")
	public String findAll(ModelMap map) {
		List list = uCKeyServiceImpl.findAll();
		map.put("list", list);
		return "uclist";
	}
	@PostMapping(value = "save")
	public String save(UCKey uCKey) {
		uCKeyServiceImpl.save(uCKey);
		return "redirect:uc";
	}
	@GetMapping(value = "delete")
	public String delete(UCKey uCKey) {
		uCKeyServiceImpl.delete(uCKey);
		return "redirect:uc";
	}
	
	@PostMapping(value = "update")
	public String update(UCKey uCKey) {
		uCKeyServiceImpl.update(uCKey);
		return "redirect:uc";
	}
	@GetMapping(value = "findByid")
	public String findByid(UCKey uCKey) {
		uCKeyServiceImpl.findByid(uCKey);
		return "forward:goInput";
	}
	@GetMapping(value = "goInput")
	public String goInput(ModelMap map) {
		List cate = iCategoryService.findAll();
		List user = iUserService.findAll();
		map.addAttribute("cate", cate);
		map.addAttribute("user", user);
		return "uc";
	}
}
