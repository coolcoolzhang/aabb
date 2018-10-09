package com.zx.service;

import java.util.List;

import com.zx.entity.tb_goods;
import com.zx.entity.tb_goods_type;

public interface goService {
    public List<tb_goods> findAll();
    public int save(tb_goods tb);
    public List<tb_goods_type> fintype();
}
