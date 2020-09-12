package com.lx.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lx.pojo.Goods;
import com.lx.mapper.GoodsMapper;
import com.lx.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public List<Goods> queryAll() {
        return goodsMapper.selectAll();
    }

    @Override
    public Goods selectByName(String name) {
        return goodsMapper.selectByName(name);
    }
}
