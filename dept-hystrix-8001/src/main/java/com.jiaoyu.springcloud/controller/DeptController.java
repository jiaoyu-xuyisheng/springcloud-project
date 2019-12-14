package com.jiaoyu.springcloud.controller;

import com.jiaoyu.springcloud.entity.Dept;
import com.jiaoyu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {


    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.findById(id);
        if(dept==null){
            throw new RuntimeException("该ID:"+id+"没有没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
       Dept dept= new Dept(id,"该ID："+id+"没有没有对应的信息,null--@HystrixCommand","no this database in MySQL");
       return dept;
    }

    @GetMapping(value="/dept/list")
    public List<Dept> list(){
        return deptService.findAll();
    }


}
