/**
 *
 */
package com.demo.jpa.controller;

import com.demo.jpa.SkuDTO;
import com.demo.jpa.controller.base.BaseController;
import com.demo.jpa.controller.base.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户登陆
 *
 * @author Administrator
 */
@Slf4j
@RestController()
@RequestMapping("/role")
public class RoleController extends BaseController {


    @GetMapping("/list")
    public Result list(){
        List<SkuDTO> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            SkuDTO sku = new SkuDTO();
            sku.setId(i);
            list.add(sku);
        }
        Page<SkuDTO> page = new PageImpl<>(list);

        return successResult(Result.MSG_SUCCESS, page);
    }

    @PostMapping("/update")
    public Result update(@RequestBody SkuDTO sku){
        log.info("修改信息:{}",sku.toString());
        return successResult(Result.MSG_SUCCESS, 1);
    }

}
