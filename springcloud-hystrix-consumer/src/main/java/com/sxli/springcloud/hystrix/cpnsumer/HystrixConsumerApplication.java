package com.sxli.springcloud.hystrix.cpnsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class HystrixConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixConsumerApplication.class).web(true).run(args);
    }
}
