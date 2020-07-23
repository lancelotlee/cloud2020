package com.sorlin.springcloud.alibaba.service;

/**
 * @author sorlin
 * @date 2020-05-10 10:32
 **/
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);

}
