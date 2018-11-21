package com.sxli.springcloud.hystrix.config.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixConfigController {

    /**
     * hystrix 默认配置
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "fullback")
    @GetMapping("/get1/{name}")
    public String get1(@PathVariable String name) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
    }

    /**
     * 不使用hystrix断路器
     * @param name
     * @return
     */
    @GetMapping("/get2/{name}")
    public String get2(@PathVariable String name) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
    }

    /**
     * 配置hystrix不启用超时,当一个微服务调用一个必不可少的微服务的时候
     * @param name
     * @return
     */
    @GetMapping("/get3/{name}")
    @HystrixCommand(commandProperties={
            @HystrixProperty(name="hystrix.command.default.execution.timeout.enabled",value="false")
    })
    public String get3(@PathVariable String name) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
    }

    /**
     * hystrix自定义超时时间,默认为1S
     * @param name
     * @return
     */
    @GetMapping("/get4/{name}")
    @HystrixCommand(commandProperties={
            @HystrixProperty(name="hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds",value="15000")
    })
    public String get4(@PathVariable String name) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
    }

    /**
     * 断路器fullback
     * @param name
     * @return
     */
    public String fullback(String name) {
        return "fullback " + name;
    }
}
