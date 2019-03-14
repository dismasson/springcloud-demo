package com.ebook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EbookGetwayZipkinApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EbookGetwayZipkinApplication.class).web(true).run(args);
    }
}
