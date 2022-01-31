package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Demo;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;
	
	public List<Demo> findAll() {
		return demoRepository.findAll();
	}
	
	public Demo findById(Integer id) {
		return demoRepository.getById(id);
	}
}
