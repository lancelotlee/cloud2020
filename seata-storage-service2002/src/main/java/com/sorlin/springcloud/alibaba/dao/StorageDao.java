package com.sorlin.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author sorlin
 * @date 2020-05-10 10:34
 **/
public interface StorageDao {
    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
