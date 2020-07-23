package com.sorlin.springcloud.config;

import cn.hutool.core.util.IdUtil;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sorlin
 * @date 2020-04-30 20:04
 **/
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route(IdUtil.simpleUUID(), r -> r.path("/payment/get/**").uri("lb://cloud-payment-service"))
                .route(IdUtil.simpleUUID(), r -> r.path("/payment/lb/**").uri("lb://cloud-payment-service"));
        return routes.build();
    }
}
