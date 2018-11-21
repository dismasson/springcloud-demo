package com.sxli.springcloud.riibbon.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RibbonConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonConsumerApplication.class).web(true).run(args);
    }
}
