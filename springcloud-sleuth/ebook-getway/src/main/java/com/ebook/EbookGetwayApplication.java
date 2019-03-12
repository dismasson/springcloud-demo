package com.ebook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EbookGetwayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EbookGetwayApplication.class).web(true).run(args);
    }
}
