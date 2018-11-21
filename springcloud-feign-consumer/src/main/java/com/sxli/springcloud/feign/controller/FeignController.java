package com.sxli.springcloud.feign.controller;

import com.sxli.springcloud.feign.facade.RibbonFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private RibbonFacade ribbonFacade;

    @GetMapping("/ribbon/get/{name}")
    public String getName(@PathVariable String name) {
        return ribbonFacade.getName(name);
    }

}
