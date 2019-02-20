package com.liudehuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liudehuang
 * @date 2019/2/20 16:58
 */
@EnableEurekaClient
@SpringBootApplication
public class ServerMemberApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerMemberApp.class,args);
    }
}
