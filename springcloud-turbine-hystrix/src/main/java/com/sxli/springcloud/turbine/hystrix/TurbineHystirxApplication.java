package com.sxli.springcloud.turbine.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class TurbineHystirxApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineHystirxApplication.class).web(true).run(args);
    }
}
