package com.woniu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.woniu.entity.Student;
import com.woniu.service.IService;
import com.woniu.service.SubjectService;
import com.woniu.service.TeacherService;

@Controller
public class StudentController {
	@Resource
	private IService studentServiceImpl;
	
	@Resource
	private TeacherService teacherServiceImpl;
	 
	@Resource
	private SubjectService subjectServiceImpl;
	
	@PostMapping(value = "students")
	public String save(Student student) {
		studentServiceImpl.save(student);
		return "redirect:students";
	}
	
	@PutMapping(value = "/students/{stid}")
	public String update(@PathVariable Integer stid, Student student) {
		studentServiceImpl.update(student);
		return "redirect:/students"; 
	}
	
	@DeleteMapping(value = "/students/{stid}")
	public String delete(@PathVariable Integer stid) {
		studentServiceImpl.delete(stid);
		return "redirect:/students";
	}
	
	@GetMapping("students")
	public String findAll(ModelMap map) {
		
		List list = studentServiceImpl.findAll();
//		ModelAndView mv =new ModelAndView();
//		mv.addObject("list", list);
//		mv.setViewName("studentlist");
		map.put("list", list);
		
		return "studentlist";
	}
	
	@GetMapping(value = "/students/{stid}")
	public String findById(@PathVariable Integer stid,ModelMap map) {
		Student student = studentServiceImpl.findById(stid);
		map.put("student", student);
		return "forward:/goInput";
	}
	
	@GetMapping(value = "goInput")
	public String goInput(ModelMap map) {
		List teachers = teacherServiceImpl.findAll();
		List subjects = subjectServiceImpl.findAll();
		map.addAttribute("teachers", teachers);
		map.addAttribute("subjects", subjects);
		return "student";
	}
}
