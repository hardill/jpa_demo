package com.demo.jpa;

import lombok.Data;

/**
 * @program: demo
 * @description: 登陆信息
 * @author: Mr.Huang
 * @create: 2020-08-31 10:16
 **/
@Data
public class LoginParam {
    private String username;
    private String password;
}
