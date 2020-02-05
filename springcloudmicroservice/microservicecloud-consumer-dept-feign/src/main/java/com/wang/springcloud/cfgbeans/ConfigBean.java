package com.wang.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 王一宁
 * @date 2020/2/4 16:56
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced//配置ribbon的负载均衡 客户端的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //1.实现更改的随机算法 会覆盖上面的轮询算法
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

    //2.实现自定义的算法 MySelfRule.class

}
