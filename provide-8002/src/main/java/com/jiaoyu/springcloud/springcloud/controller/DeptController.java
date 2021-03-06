package com.jiaoyu.springcloud.springcloud.controller;

import com.jiaoyu.springcloud.entity.Dept;
import com.jiaoyu.springcloud.springcloud.service.DeptService;
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
    public Dept get(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @GetMapping(value="/dept/list")
    public List<Dept> list(){
        return deptService.findAll();
    }


}
