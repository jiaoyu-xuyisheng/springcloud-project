package com.jiaoyu.springcloud.service;

import com.jiaoyu.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "DEPT-SERVICE",fallbackFactory = DeptServiceFallBackFactory.class)
public interface DeptService {

    @RequestMapping(value = "/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list",method=RequestMethod.GET)
    public List<Dept> list();

    @RequestMapping(value="/dept/add",method=RequestMethod.POST)
    public boolean add(Dept dept);
}
