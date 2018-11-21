package com.sxli.springcloud.hystrix.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HystrixConfigApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixConfigApplication.class).web(true).run(args);
    }
}
