/*package com.joyintech.core;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.joyintech.core.dao.BrandDao.BrandDao;
import com.joyintech.core.product.Brand;
import com.joyintech.core.service.BrandService;

import cn.itcast.common.page.Pagination;

public class ProductTest extends BaseTest{
   
    @Autowired
    private BrandDao brandDao;
    
    @Autowired
    private BrandService brandService;
    
  //  @Test
    public void teseInsertBrand(){
        Brand brand = new Brand();
        String name = "测试品牌";
        for(int i = 3;i<30000;i++){
            brand.setName(name + i);
            brand.setIsDisplay(1);
            brand.setDescription("描述" + i);
            brand.setImgUrl("res/img/pic/ppp.jpg");
            brand.setSort(i);
            brandDao.insertBrand(brand);
        }
    }

    @Test
    public void testQueryBrand(){
        Pagination pagination = brandService.selectPaginationByQuery(1, "莲", 1);
        List list = pagination.getList();
        System.out.println(list.size());
    }
}
*/