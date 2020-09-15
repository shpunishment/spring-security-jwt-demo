package com.shpun.jwt.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 无认证可访问
 * @Author: sun
 * @Date: 2020/7/10 14:44
 */
@Api(tags = "测试控制器")
@RequestMapping("/test")
@RestController
public class TestController {

    @ApiOperation("测试")
    @GetMapping("/test1")
    public ResponseEntity test1(String str){
        return ResponseEntity.ok().body("test1" + str);
    }

}
