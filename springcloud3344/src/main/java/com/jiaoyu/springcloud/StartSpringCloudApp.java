package com.jiaoyu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StartSpringCloudApp {

    public static void main(String[] args){
        SpringApplication.run(StartSpringCloudApp.class,args);
    }

}
