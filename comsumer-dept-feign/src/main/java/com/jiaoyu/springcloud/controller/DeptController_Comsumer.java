package com.jiaoyu.springcloud.controller;


import com.jiaoyu.springcloud.entity.Dept;
import com.jiaoyu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Comsumer {

    @Value("${REST_URL_PREFIX}")
    private  String REST_URL_PREFIX;



    @Autowired
    private DeptService deptService;


    @GetMapping("/list")
    public List<Dept> list(){
        return this.deptService.list();
    }


    @GetMapping("/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return this.deptService.get(id);
    }

    @PostMapping("/add")
    public boolean add(Dept dept){
        return this.deptService.add(dept);
    }

}
