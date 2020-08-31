package com.demo.jpa;

import lombok.Data;

/**
 * @program: demo
 * @description: 登陆信息
 * @author: Mr.Huang
 * @create: 2020-08-31 10:16
 **/
@Data
public class SkuDTO {
    private String name="name";
    private String code="code";
    private double price;
    private int id;
}
