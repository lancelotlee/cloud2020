package com.sorlin.springcloud.alibaba.controller;

import com.sorlin.springcloud.alibaba.domain.CommonResult;
import com.sorlin.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author sorlin
 * @date 2020-05-10 10:41
 **/
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;


    //扣减库存
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}

