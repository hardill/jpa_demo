/**
 *
 */
package com.demo.jpa.controller;

import com.demo.jpa.LoginInfoDTO;
import com.demo.jpa.LoginParam;
import com.demo.jpa.UserInfoDTO;
import com.demo.jpa.controller.base.BaseController;
import com.demo.jpa.controller.base.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登陆
 *
 * @author Administrator
 */
@Slf4j
@RestController()
@RequestMapping("/user")
public class LoginController extends BaseController {

    @PostMapping("/login")
    public Result login(@RequestBody LoginParam loginInfo){
        log.info("账号登陆:{}",loginInfo.toString());
        LoginInfoDTO userInfoDTO = new LoginInfoDTO();
        return successResult(Result.MSG_SUCCESS, userInfoDTO);
    }


    @GetMapping("/info")
    public Result info(String token){
        log.info("获取用户信息:{}",token);
        UserInfoDTO userInfo=new UserInfoDTO();
        return successResult(Result.MSG_SUCCESS, userInfo);
    }

    @PostMapping("/logout")
    public Result logout(){
        log.info("用户退出登陆:{}");
        return successResult(Result.MSG_SUCCESS, "");
    }

}
