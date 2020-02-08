package com.wang.springboot.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 王一宁
 * @date 2020/2/6 12:38
 * 吧主键属性抽出来成为一个父类 通过继承得到主键
 * 其他的类通过继承得到ID
 */

@MappedSuperclass //映射的超类
public class DominImpl {

    //@Id
    //@GeneratedValue
    //private Long id;

    @Temporal(TemporalType.TIMESTAMP) //时间戳
    private Date createdTime = new Date();

}
