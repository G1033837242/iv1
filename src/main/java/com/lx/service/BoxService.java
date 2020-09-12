package com.lx.service;

import com.lx.pojo.Box;
import com.lx.pojo.Goods;

import java.util.List;

public interface BoxService{


    int insert(Box record);

    Box selectByName(String name);

    List<Box> queryList(Goods goods);
}
