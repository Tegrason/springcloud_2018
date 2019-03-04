package com.luxsong.springcloud.relu;

import com.luxsong.myrule.MyRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public MyRule myRule(){
        return new MyRule();
    }
}
