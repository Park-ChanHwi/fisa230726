package com.fisa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisa.model.dao.DayRepository;
import com.fisa.model.domain.entity.Day;

@RestController
public class DayController {

	@Autowired
	private DayRepository dao;
	
	// http://localhost:8080/sunday/dayall
	@GetMapping("/dayall")
	public String dayAll() {
		dao.save(new Day(1, "monday"));
		dao.save(new Day(2, "tuesday"));
		dao.save(new Day(3, "wednesday"));
		dao.save(new Day(4, "thursday"));
		dao.save(new Day(5, "friday"));
		dao.save(new Day(6, "saturday"));
		dao.save(new Day(7, "sunday"));
		
		String str = "";
		for (Day day : dao.findAll()) {
			str += day.toString() + "<br>";
		}
		
		return str;
	}
}
