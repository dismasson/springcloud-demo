package com.sxli.springcloud.sleuth.model;

import java.io.Serializable;

/**
 * 用户模型
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7386093296143294345L;

    // 用户编号
    String userId;

    // 用户名
    String userName;

    // mima
    String pwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
