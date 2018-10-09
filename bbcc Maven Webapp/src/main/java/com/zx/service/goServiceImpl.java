package com.zx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.dao.goDao;
import com.zx.entity.tb_goods;
import com.zx.entity.tb_goods_type;
@Service
public class goServiceImpl implements goService{
@Autowired
private goDao dao;

	@Override
	public List<tb_goods> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public int save(tb_goods tb) {
		// TODO Auto-generated method stub
		return dao.save(tb);
	}

	@Override
	public List<tb_goods_type> fintype() {
		// TODO Auto-generated method stub
		return dao.fintype();
	}

}
