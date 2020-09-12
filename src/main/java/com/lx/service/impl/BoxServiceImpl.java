package com.lx.service.impl;

import com.lx.pojo.Goods;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lx.mapper.BoxMapper;
import com.lx.pojo.Box;
import com.lx.service.BoxService;

import java.util.List;

@Service
public class BoxServiceImpl implements BoxService{

    @Resource
    private BoxMapper boxMapper;

    @Override
    public int insert(Box record) {
        return boxMapper.insert(record);
    }

    @Override
    public Box selectByName(String name) {
        return boxMapper.selectByName(name);
    }

    @Override
    public List<Box> queryList(Goods goods) {
        return boxMapper.selectList(goods);
    }

}
