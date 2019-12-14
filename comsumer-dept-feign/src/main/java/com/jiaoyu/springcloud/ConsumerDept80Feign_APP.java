package com.jiaoyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.jiaoyu.springcloud"})
@ComponentScan("com.jiaoyu")
public class ConsumerDept80Feign_APP {

    public static void main(String[] args){
        SpringApplication.run(ConsumerDept80Feign_APP.class,args);
    }

}
