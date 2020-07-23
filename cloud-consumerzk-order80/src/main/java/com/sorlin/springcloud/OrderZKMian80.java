package com.sorlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sorlin
 * @date 2020-04-24 15:59
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMian80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMian80.class,args);
    }
}
