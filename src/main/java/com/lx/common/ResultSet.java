package com.lx.common;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultSet {


    private int status;
    // 返回结果中携带的数据对象
    private Object data;

    public static ResultSet ok(){
        return new ResultSet(200, null);
    }

    public static ResultSet ok(Object data){
        return new ResultSet(200, data);
    }

    public static ResultSet error(){
        return new ResultSet(500,null);
    }

    public static ResultSet error(Object data){
        return new ResultSet(500,data);
    }

}
