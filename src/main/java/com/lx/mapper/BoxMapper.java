package com.lx.mapper;

import com.lx.pojo.Box;
import com.lx.pojo.Goods;

import java.util.List;

public interface BoxMapper {
    int insert(Box record);

    Box selectByName(String name);

    List<Box> selectList(Goods goods);
}