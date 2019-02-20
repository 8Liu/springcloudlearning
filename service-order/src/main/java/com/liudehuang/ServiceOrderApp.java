package com.liudehuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liudehuang
 * @date 2019/2/20 17:07
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApp.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
