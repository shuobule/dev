package com.joyintech.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joyintech.core.product.Brand;
import com.joyintech.core.service.BrandService;

import cn.itcast.common.page.Pagination;

/**
 * 
 * @Description 品牌管理Controller
 * @Author kwang
 * @Version 1.0.0
 * @Date 2016年12月23日 上午9:42:27
 */
@Controller
@RequestMapping(value = "/brand/")
public class BrandController {
    
    @Autowired
    private BrandService brandService;
    
    @RequestMapping(value = "list.do")
    public String list(Integer pageNo,String name,Integer isDisplay,Model model){
        Pagination pagination = brandService.selectPaginationByQuery(pageNo, name, isDisplay);
        model.addAttribute("pagination", pagination);
        model.addAttribute("isDisplay", isDisplay);
        model.addAttribute("name", name);
        return "brand/list";
    }
    
    /**
     * 
     * @Description 跳转到编辑显示页面
     * @Author kwang
     * @Date 2016年12月25日 上午12:24:43 
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "toEdit.do")
    public String toEdit(Long id,Model model){
        Brand brand = brandService.selectBrandById(id);
        model.addAttribute("brand", brand);
        return "brand/edit";
    }

}
