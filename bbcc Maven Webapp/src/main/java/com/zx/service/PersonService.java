package com.zx.service;

import java.util.List;

import com.zx.entity.Person;


public interface PersonService {
	public int save(Person p);
	public List<Person> queryAll();
}
