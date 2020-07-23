package com.sorlin.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.sorlin.springcloud.entities.CommonResult;

/**
 * @author sorlin
 * @date 2020-05-07 11:29
 **/
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
}
