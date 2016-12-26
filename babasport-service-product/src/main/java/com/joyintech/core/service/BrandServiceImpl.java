package com.joyintech.core.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joyintech.core.dao.BrandDao.BrandDao;
import com.joyintech.core.product.Brand;
import com.joyintech.core.product.BrandQuery;

import cn.itcast.common.page.Pagination;

/**
 * 
 * @Description 品牌service
 * @Author kwang
 * @Version 1.0.0
 * @Date 2016年12月23日 上午10:49:27
 */
@Service(value = "brandService")
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandDao brandDao;
    
    @Override
    public Pagination selectPaginationByQuery(Integer pageNo,String name,Integer isDisplay) {
        BrandQuery brandQuery = new BrandQuery();
        //当前页  pageNo如果是null 或小于1时 设置pageNo =1
        brandQuery.setPageNo(Pagination.cpn(pageNo));
        //每页显示数目
        brandQuery.setPageSize(10);
        
        StringBuilder params = new StringBuilder();
        
        if(StringUtils.isNotBlank(name)){
            brandQuery.setName(name.trim());
            params.append("name=").append(name);
        }
        if(null != isDisplay){
            brandQuery.setIsDisplay(isDisplay);
            params.append("&isDisplay=").append(isDisplay);
        }else{
            brandQuery.setIsDisplay(1);
            params.append("&isDisplay=").append(1);
        }
       //构建分页对象 （当前页，每页数（自定义）、总条数）
        Pagination pagination = new Pagination(
            brandQuery.getPageNo(),brandQuery.getPageSize(),
            brandDao.selectBrandCountByQuery(brandQuery));
        List<Brand> lists = brandDao.selectBrandListByQuery(brandQuery);
        pagination.setList(lists);
        String url = "/brand/list.do";
        //分页在页面上的展示   <a onclick="/product/list.do?&isDisplay=1&pageNo=2"
        pagination.pageView(url, params.toString());
        return pagination;
    }

    @Override
    public Brand selectBrandById(Long id) {
        return brandDao.selectBrandById(id);
    }

}
