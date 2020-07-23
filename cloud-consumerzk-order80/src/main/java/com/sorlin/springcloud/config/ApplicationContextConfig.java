package com.sorlin.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author sorlin
 * @date 2020-04-24 16:10
 **/
@SpringBootConfiguration
public class ApplicationContextConfig {
    @Bean
    //标注此注解后，RestTemplate就具有了客户端负载均衡能力
    //必须添加此注解，否则java.net.UnknownHostException: CLOUD-PAYMENT-SERVICE
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
