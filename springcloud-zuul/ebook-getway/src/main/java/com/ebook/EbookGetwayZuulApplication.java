package com.ebook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EbookGetwayZuulApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EbookGetwayZuulApplication.class).web(true).run(args);
    }
}
