package com.joyintech.core.dao.BrandDao;

import java.util.List;

import com.joyintech.core.product.Brand;
import com.joyintech.core.product.BrandQuery;

/**
 * 
 * @Description 品牌DAO
 * @Author kwang
 * @Version 1.0.0
 * @Date 2016年12月23日 上午9:47:14
 */
public interface BrandDao {

    /**
     * 
     * @Description 第一步：查询结果集  （条件） 名称  是否可用   limit 开始行 ，每页数
     * @Author kwang
     * @Date 2016年12月23日 上午9:51:04 
     * @param brandQuery
     * @return
     */
     List<Brand> selectBrandListByQuery(BrandQuery brandQuery);
     
     /**
      * 
      * @Description 统计条数
      * @Author kwang
      * @Date 2016年12月24日 下午11:40:35 
      * @param brandQuery
      * @return
      */
     Integer selectBrandCountByQuery(BrandQuery brandQuery);
     
     /**
      * 
      * @Description 插入品牌管理
      * @Author kwang
      * @Date 2016年12月23日 上午10:21:43 
      * @param brand
      * @return
      */
     Integer insertBrand(Brand brand);
     
     /**
      * 
      * @Description 通过ID查询一个品牌
      * @Author kwang
      * @Date 2016年12月25日 上午12:25:41 
      * @param id
      * @return
      */
     Brand selectBrandById(Long id);
}
