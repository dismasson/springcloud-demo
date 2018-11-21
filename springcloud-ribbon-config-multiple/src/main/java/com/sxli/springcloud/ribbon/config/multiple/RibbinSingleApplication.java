package com.sxli.springcloud.ribbon.config.single;

import com.sxli.springcloud.ribbon.config.configure.RibbonClientConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
// 指定ribbon客户端对多个微服务采用指定的策略
@RibbonClients(
        value = {@RibbonClient(name="ribbon-producer1",configuration = RibbonClientConfiguration.class),
                 @RibbonClient(name="ribbon-producer2",configuration = RibbonClientConfiguration.class)}
)
public class RibbinSingleApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbinSingleApplication.class).web(true).run(args);
    }
}
