package com.fang.demo.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Author fang
 * @Date 2021/4/10
 * @Description TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/hello3")
    public String test1() {

        return "hello world。。。";
    }


}
