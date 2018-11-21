package com.sxli.springcloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
public class StreamHelloConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamHelloConsumerApplication.class, args);
    }
}
