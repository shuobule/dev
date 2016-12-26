package com.joyintech.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Description 商品controller
 * @Author kwang
 * @Version 1.0.0
 * @Date 2016年12月22日 下午3:44:19
 */
@Controller
@RequestMapping(value = "/product/")
public class ProductController {

    
    @RequestMapping(value = "list.do")
    public String list(){
        return "product/list";
    }
    
}
