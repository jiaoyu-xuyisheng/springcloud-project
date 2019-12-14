package com.jiaoyu.springcloud.service;

import com.jiaoyu.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptServiceFallBackFactory implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        return new DeptService(){

            @Override
            public Dept get(Long id) {
                return new Dept(id,"该ID："+id+"没有没有对应的信息,null--@HystrixCommand","no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
