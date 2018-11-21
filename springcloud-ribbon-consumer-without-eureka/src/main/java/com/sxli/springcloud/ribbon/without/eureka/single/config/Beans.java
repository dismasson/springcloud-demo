package com.sxli.springcloud.ribbon.without.eureka.single.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Beans {

    @Bean
    @LoadBalanced
    public RestTemplate loadBalancedRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public RestTemplate notLoadBalancedRestTemplate(){
        return new RestTemplate();
    }

}
