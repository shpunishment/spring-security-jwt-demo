package com.shpun.jwt.controller;

import com.shpun.jwt.security.SecurityUserDetails;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 认证过才可访问
 * @Author: sun
 * @Date: 2020/7/10 14:44
 */
@Api(tags = "Api控制器")
@RequestMapping("/api")
@RestController
public class ApiController {

    @ApiOperation("认证测试")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "str", value = "字符串", dataType = "String")
    })
    @GetMapping("/api1")
    public String api1(String str){
        return "api1" + str;
    }

    @ApiOperation("获取当前用户")
    @GetMapping("/getCurrentUser")
    public UserDetails getCurrentUser(){
        SecurityUserDetails securityUserDetails = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if (principal instanceof String) {
            // 未登录为anonymousUser
            if ("anonymousUser".equals(principal)) {
                return securityUserDetails;
            }
        } else {
            securityUserDetails = (SecurityUserDetails) principal;
            securityUserDetails.setPassword(null);
        }
        return securityUserDetails;
    }

}
