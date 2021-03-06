package com.sorlin.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author sorlin
 * @date 2020-05-10 10:21
 **/
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.sorlin.springcloud.alibaba.dao")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataStorageServiceApp2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageServiceApp2002.class,args);
    }
}
