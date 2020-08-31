package com.demo.jpa;

import lombok.Data;

/**
 * @program: demo
 * @description: 登陆信息
 * @author: Mr.Huang
 * @create: 2020-08-31 10:16
 **/
@Data
public class LoginInfoDTO {
    private String token="11f81db299e-4161-4691-9188-36ef7edbf";
    private UserInfoDTO userInfo=new UserInfoDTO();
}
