package com.zx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.dao.PersonDao;
import com.zx.entity.Person;


@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao dao;

	@Override
	public int save(Person p) {
		return dao.save(p);
	}

	@Override
	public List<Person> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

}
