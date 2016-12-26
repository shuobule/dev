package com.joyintech.core.service;

import com.joyintech.core.product.Brand;

import cn.itcast.common.page.Pagination;

/**
 * 
 * @Description 品牌service接口
 * @Author kwang
 * @Version 1.0.0
 * @Date 2016年12月23日 上午10:48:58
 */
public interface BrandService {

    /**
     * 
     * @Description 返回分页对象
     * @Author kwang
     * @Date 2016年12月23日 上午9:51:04 
     * @param brandQuery
     * @return
     */
    public Pagination selectPaginationByQuery(Integer pageNo,String name,Integer isDisplay);
    
    /**
     * 
     * @Description 根据id查询一个品牌
     * @Author kwang
     * @Date 2016年12月25日 上午12:28:10 
     * @param id
     * @return
     */
    Brand selectBrandById(Long id);
}
