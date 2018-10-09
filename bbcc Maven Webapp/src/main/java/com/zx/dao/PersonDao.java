package com.zx.dao;

import java.util.List;

import com.zx.entity.Person;

public interface PersonDao {
	public int save(Person p);
	public List<Person> queryAll();
}
