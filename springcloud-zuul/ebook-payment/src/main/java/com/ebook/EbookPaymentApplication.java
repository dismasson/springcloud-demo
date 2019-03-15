package com.ebook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EbookPaymentApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EbookPaymentApplication.class).web(true).run(args);
    }
}
