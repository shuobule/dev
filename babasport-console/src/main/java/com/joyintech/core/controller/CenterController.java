package com.joyintech.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @Description 后台管理
 * @Author kwang
 * @Version 1.0.0
 * @Date 2016年12月22日 下午2:18:54
 */
@Controller
@RequestMapping(value = "/console/")
public class CenterController {

    //入口
    @RequestMapping(value = "index.do")
    public String index(){
        return "index";
    }
    
    //顶部
    @RequestMapping(value = "top.do")
    public String top(){
        return "top";
    }
    
    //身体
    @RequestMapping(value = "main.do") 
    public String main(){
        return "main";
    }
    
    //左边
    @RequestMapping(value = "left.do")
    public String left(){
        return "left";
    }
    
    //右边
    @RequestMapping(value = "right.do")
    public String right(){
        return "right";
    }
    
   //商品身体
    @RequestMapping(value = "frame/product_main.do")
    public String product_main(){
        return "frame/product_main";
    }
    
    @RequestMapping(value = "frame/product_left.do")
    public String product_left(){
        return "frame/product_left";
    }
}
