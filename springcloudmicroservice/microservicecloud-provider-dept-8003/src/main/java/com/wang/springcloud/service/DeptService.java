package com.wang.springcloud.service;

import com.wang.springcloud.entities.Dept;

import java.util.List;

/**
 * @author 王一宁
 * @date 2020/2/4 16:24
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
