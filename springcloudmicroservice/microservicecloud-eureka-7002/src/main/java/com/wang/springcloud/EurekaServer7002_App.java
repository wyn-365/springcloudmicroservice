package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 王一宁
 * @date 2020/2/4 18:11
 * 标注Eureka服务器标签
 */

@SpringBootApplication
@EnableEurekaServer //标注Eureka服务器标签
public class EurekaServer7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
