package com.form_demo.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	
	@Autowired
	ServiceDemo ob;
	
	@GetMapping("/fetch/{id}")
	public List<Map<String,Object>> fetch(@PathVariable int id) {
		return ob.fetch(id);
	}
} 
