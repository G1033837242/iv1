package com.lx.service;

import com.lx.pojo.Goods;

import java.util.List;

public interface GoodsService{


    int insert(Goods record);

    Goods selectByName(String name);

    List<Goods> queryAll();

}
