package com.sxli.springcloud.eureka.producer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProducerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaProducerApplication.class).web(true).run(args);
    }
}
