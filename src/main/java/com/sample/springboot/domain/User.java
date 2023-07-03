package com.sample.springboot.domain;

public class User {
    /* 이거 필요한가?? */
    private String userName;
    private String userPassword;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
}
