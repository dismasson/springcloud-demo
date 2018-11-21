package com.sxli.springcloud.feign.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ribbon-producer")
public interface RibbonFacade {
    @GetMapping("/ribbon/get/{name}")
    String getName(@PathVariable("name") String name);
}
