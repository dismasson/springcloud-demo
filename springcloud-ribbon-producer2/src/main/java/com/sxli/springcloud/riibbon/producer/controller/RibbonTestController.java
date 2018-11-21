package com.sxli.springcloud.riibbon.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonTestController {

    @GetMapping("/ribbon/get/{name}")
    public String get(@PathVariable String name) {
        return "hello " + name;
    }

}
