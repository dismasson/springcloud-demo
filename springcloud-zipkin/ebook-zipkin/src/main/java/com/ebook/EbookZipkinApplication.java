package com.ebook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class EbookZipkinApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EbookZipkinApplication.class).web(true).run(args);
    }
}
