package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.domain.model.entity.Hello;
import com.web.intrasturcture.dao.HelloDao;

@RestController
public class HelloRestController {
	
	@Autowired
	private HelloDao HelloDao;
	
	@RequestMapping("/add")
	public Hello add(Hello hello) {
		Hello helloData = HelloDao.save(hello);
		return helloData;
	}
	
	@RequestMapping("/list")
	public List<Hello> list(Model model){
		List<Hello> helloList = HelloDao.findAll();
		return helloList;
	}
	
	@RequestMapping("/")
	public String index() {
		return "helloworld";
	}
}
