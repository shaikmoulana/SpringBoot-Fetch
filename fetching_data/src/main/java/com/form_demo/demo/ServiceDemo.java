package com.form_demo.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class ServiceDemo {

	@Autowired
	JdbcTemplate jt;

	public List<Map<String,Object>> fetch(int id) {
		List<Map<String, Object>> list = null, ls = null;
		String sql = "select * from employee";
		try {
			ls = jt.queryForList(sql);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		return ls;
	}
	
}
