package com.sxli.springcloud.user.controller;

import com.sxli.springcloud.user.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUserByName")
    public ResponseEntity<User> getUserByName(@RequestParam String name) {
        if (name != null) {
            User user = new User();
            user.setName("sxli");
            user.setPassword("sxli");
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.ok(null);
        }
    }

}
