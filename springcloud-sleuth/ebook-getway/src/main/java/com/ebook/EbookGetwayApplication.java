package com.ebook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableZuulProxy
public class EbookGetwayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EbookGetwayApplication.class).web(true).run(args);
    }
}
