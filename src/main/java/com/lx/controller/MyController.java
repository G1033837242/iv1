package com.lx.controller;

import com.lx.common.ResultSet;
import com.lx.pojo.Box;
import com.lx.pojo.Goods;
import com.lx.service.BoxService;
import com.lx.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/iv")
public class MyController {

    @Autowired
    private BoxService boxService;
    @Autowired
    private GoodsService goodsService;

    @PostMapping("/insertBox")
    public ResultSet insertBox(@RequestBody Box box){
        String name = box.getName();
        Box box1 = boxService.selectByName(name);
        if (box1 != null){
            return ResultSet.error("箱子名称已存在，请重新取名");
        }
        int insert = boxService.insert(box);
        System.out.println(box.toString());
        return ResultSet.ok("箱子已存入");
    }

    @PostMapping("/insertGoods")
    public ResultSet insertGoods(@RequestBody Goods goods){
        String gName = goods.getName();
        Goods goods1 = goodsService.selectByName(gName);
        if (goods1 != null){
            return ResultSet.error("物品重名，请重试");
        }
        goodsService.insert(goods);

        return ResultSet.ok("物品成功存入");

    }

    @GetMapping("/toInsertInto")
    public ResultSet findAllGoods(){
        //查出所有物品，以供选择
        List<Goods> goodsList = goodsService.queryAll();
        return ResultSet.ok(goodsList);
    }

    @GetMapping("/boxList")
    public ResultSet insertInto(@RequestParam String gName){

        Goods goods = goodsService.selectByName(gName);


        List<Box> list = boxService.queryList(goods);
        if (list == null || list.isEmpty() ){
            return ResultSet.error("没有箱子符合条件");
        }


        return ResultSet.ok(list);
    }


    

}
