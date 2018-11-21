package com.sxli.springcloud.ribbon.without.eureka.single.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate loadBalancedRestTemplate;

    @Autowired
    private RestTemplate notLoadBalancedRestTemplate;

    @GetMapping("/consumer/get/{name}/loadBalanced")
    public String loadBalanced(@PathVariable String name){
        return loadBalancedRestTemplate.getForObject("http://ribbon-producer/ribbon/get/"+name,String.class);
    }

    @GetMapping("/consumer/get/{name}/notLoadBalanced")
    public String notLoadBalanced(@PathVariable String name){
        return notLoadBalancedRestTemplate.getForObject("http://ribbon-producer/ribbon/get/"+name,String.class);
    }
}
