package com.jiaoyu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class DeptProvide8001Config_App {
    public static void main(String[] args){
        SpringApplication.run(DeptProvide8001Config_App.class,args);
    }
}
