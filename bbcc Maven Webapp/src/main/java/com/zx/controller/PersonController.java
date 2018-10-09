package com.zx.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.entity.Person;
import com.zx.service.PersonService;


@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService service;

	@RequestMapping("/save")
	public String save(@RequestBody Person p,Map map,HttpServletResponse response) throws IOException {
		int result= service.save(p);
		map.put("person", p);
		return "list";
	}
	 @ResponseBody
	   @RequestMapping("/sel")
		public List<Person> recivJson1(Person p) throws IOException{
			List<Person> list=service.queryAll();
			return list;
		}
}
