package com.shpun.jwt.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: sun
 * @Date: 2020/4/7 15:28
 */
@Api(tags = "页面控制器")
@RequestMapping("/page")
@RestController
public class PageController {

    @ApiOperation("page1 需要权限值 PageController:page1")
    @PreAuthorize("hasAuthority('PageController:page1')")
    @GetMapping("/page1")
    public String page1() {
        return "page1";
    }

    @ApiOperation("page2 需要权限值 PageController:page2")
    @PreAuthorize("hasAuthority('PageController:page2')")
    @GetMapping("/page2")
    public String page2() {
        return "page2";
    }

    @ApiOperation("page3 需要权限值 PageController:page3")
    @PreAuthorize("hasAuthority('PageController:page3')")
    @GetMapping("/page3")
    public String page3() {
        return "page3";
    }

    @ApiOperation("page4 需要权限值 PageController:page4")
    @PreAuthorize("hasAuthority('PageController:page4')")
    @GetMapping("/page4")
    public String page4() {
        return "page4";
    }

    @ApiOperation("page5 需要权限值 PageController:page5")
    @PreAuthorize("hasAuthority('PageController:page5')")
    @GetMapping("/page5")
    public String page5() {
        return "page5";
    }

    @ApiOperation("page6 需要权限值 PageController:page6")
    @PreAuthorize("hasAuthority('PageController:page6')")
    @GetMapping("/page6")
    public String page6() {
        return "page6";
    }

}
