package com.wang.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 王一宁
 * @date 2020/2/4 15:33
 */

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable { //必须要实现序列化接口
    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个数据库，一个服务对应一个数据库

    public Dept(String dname){
        this.dname = dname;
    }
}
