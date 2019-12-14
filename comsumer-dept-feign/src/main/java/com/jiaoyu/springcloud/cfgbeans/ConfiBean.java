package com.jiaoyu.springcloud.cfgbeans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfiBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
