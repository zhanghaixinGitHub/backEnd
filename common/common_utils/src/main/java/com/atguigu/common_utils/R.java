package com.atguigu.common_utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class R {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String,Object> data = new HashMap<String,Object>();

    //这里把构造方法私有了，就是new不出来了
    private R(){}

    //链式编程


    public static R ok(){
        R r = new R();
        r.setCode(ResultCode.SUCCESS);
        r.setSuccess(true);
        r.setMessage("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setCode(ResultCode.ERROR);
        r.setSuccess(false);
        r.setMessage("失败");
        return r;
    }

    public  R success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public  R message(String message){
        this.setMessage(message);
        return this;
    }

    public  R code(Integer code){
        this.setCode(code);
        return this;
    }

    public  R data(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    public  R data(Map<String,Object> map){
        this.setData(map);
        return this;
    }

}
