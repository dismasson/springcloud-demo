package com.sxli.springcloud.sleuth.user.controller;

import com.sxli.springcloud.sleuth.user.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 根据令牌获取用户信息
     *
     * @return
     */
    @RequestMapping("/data/{token}")
    public User getUserByToken(@PathVariable("token") String token) {
        User user = new User();
        user.setUserId("001");
        user.setUserName("模拟用户");
        return user;
    }

}
