/**
 *
 */
package com.demo.jpa.controller;

import com.demo.jpa.controller.base.BaseController;
import com.demo.jpa.controller.base.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 统一返回方法
 *
 * @author Administrator
 */
@Slf4j
@RestController
public class LoginController extends BaseController {

    @PostMapping("/login")
    public Result login(String name){
        return successResult(Result.MSG_SUCCESS, "");
    }

}
