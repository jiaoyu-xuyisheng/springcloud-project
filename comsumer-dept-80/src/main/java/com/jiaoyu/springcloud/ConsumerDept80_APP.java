package com.jiaoyu.springcloud;

import com.jiaoyu.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="DEPT-SERVICE",configuration= MySelfRule.class)
public class ConsumerDept80_APP {

    public static void main(String[] args){
        SpringApplication.run(ConsumerDept80_APP.class,args);
    }

}
