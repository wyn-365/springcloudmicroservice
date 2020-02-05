package com.wang.springcloud;

import com.wang.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 王一宁
 * @date 2020/2/4 17:36
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient这个注解不会使用默认的算法机制，会使用自己自定义的算法Ribbon机制
@RibbonClient(name = "MICEOSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
