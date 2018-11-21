package com.sxli.springcloud.oauth2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableDiscoveryClient
@EnableAuthorizationServer
@SpringBootApplication
public class OAuth2Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(OAuth2Application.class).web(true).run(args);
    }
}
