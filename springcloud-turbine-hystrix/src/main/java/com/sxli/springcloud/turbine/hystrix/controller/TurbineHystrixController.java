package com.sxli.springcloud.turbine.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turbine/hystrix")
public class TurbineHystrixController {

    @HystrixCommand(fallbackMethod = "fullback")
    @GetMapping("/get/{name}")
    public String get1(@PathVariable String name) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
    }

    public String fullback(String name) {
        return "fullback " + name;
    }
}
