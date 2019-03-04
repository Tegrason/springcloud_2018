package com.luxsong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootApplicationZuul_9527 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationZuul_9527.class,args);
    }
}
