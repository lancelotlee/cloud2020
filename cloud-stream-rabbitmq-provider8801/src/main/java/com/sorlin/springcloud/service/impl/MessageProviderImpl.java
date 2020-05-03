package com.sorlin.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.sorlin.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

/**
 * @author 李松岭
 * @date 2020-05-03 15:57
 **/
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = IdUtil.simpleUUID();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("********serial："+serial);
        return null;
    }
}
