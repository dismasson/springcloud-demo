package com.sxli.springcloud.oauth2.service.impl;

import com.sxli.springcloud.oauth2.domain.User;
import com.sxli.springcloud.oauth2.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserFacade userFacade;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ResponseEntity<User> responseEntity = userFacade.getUserByName(username);
        User user = responseEntity.getBody();
        if (user == null) {
            throw new UsernameNotFoundException("找不到该用户，用户名：" + username);
        }
        org.springframework.security.core.userdetails.User sucerityUser = new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), null);
        return sucerityUser;
    }
}
