package com.sxli.springcloud.oauth2.facade;


import com.sxli.springcloud.oauth2.domain.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-producer")
public interface UserFacade {

    @GetMapping("/getUserByName")
    ResponseEntity<User> getUserByName(String userName);
}
