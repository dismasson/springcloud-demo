package com.sxli.springcloud.riibbon.producer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonProducerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonProducerApplication.class).web(true).run(args);
    }
}
