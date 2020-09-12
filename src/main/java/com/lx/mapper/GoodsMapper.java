package com.lx.mapper;

import com.lx.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    int insert(Goods record);

    Goods selectByName(String name);

    List<Goods> selectAll();
}