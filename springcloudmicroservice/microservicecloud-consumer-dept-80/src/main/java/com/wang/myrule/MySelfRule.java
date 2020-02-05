package com.wang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王一宁
 * @date 2020/2/5 10:13
 */

@Configuration
public class MySelfRule {

    //自定义的Ribbon随机算法,这个类不能放到ComponentScan扫描的包下
    @Bean
    public IRule myRule(){
        //return new RandomRule();//Ribbon默认是轮询算法，我改为随机算法
        //return new RoundRobinRule();//Ribbon默认是轮询算法,我自定义一个服务器访问5次
        return new RandomRule_ZY();//我自定义每台服务器访问5次
    }
}
