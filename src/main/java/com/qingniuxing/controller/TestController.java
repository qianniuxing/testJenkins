package com.qingniuxing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author niu
 * @Date 2020/4/5
 * @Version 1.0
 **/
@RequestMapping("/test")
@RestController
public class TestController {



    @RequestMapping("/getApp")
    public String getApp() {
        return "测试TestJenkinsApplication";
    }

}
