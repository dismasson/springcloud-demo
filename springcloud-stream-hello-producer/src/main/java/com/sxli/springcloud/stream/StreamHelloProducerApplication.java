package com.sxli.springcloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ISenderService.class)
public class StreamHelloProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreamHelloProducerApplication.class, args);
    }
}
