package com.jiaoyu.springcloud.service;

import com.jiaoyu.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
    public  boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
