package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 王一宁
 * @date 2020/2/5 17:10
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class, args);
    }
}