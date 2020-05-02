package com.sorlin.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 李松岭
 * @date 2020-04-25 17:38
 **/
@Component
public class MyLB implements LoadBalancer{

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }
        while (!atomicInteger.compareAndSet(current,next));
            System.out.println("*******第几次访问，次数next: "+next);
            return next;

    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        //得到服务器的下标位置
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
