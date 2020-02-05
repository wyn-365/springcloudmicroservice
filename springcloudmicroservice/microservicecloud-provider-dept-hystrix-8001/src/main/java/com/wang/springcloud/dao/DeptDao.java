package com.wang.springcloud.dao;

import com.wang.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 王一宁
 * @date 2020/2/4 16:13
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
