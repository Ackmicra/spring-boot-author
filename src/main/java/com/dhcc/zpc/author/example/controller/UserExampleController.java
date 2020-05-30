package com.dhcc.zpc.author.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author 赵朋超
 * @Date 2020/5/30 11:23
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserExampleController {

    @GetMapping("/helloGet")
    public String helloGet(){
        return "Hello World...I AM A GET REQUEST";
    }

    @PostMapping("/helloPost")
    public String helloPost(){
        return "Hello World... I AM A POST REQUEST";
    }
}
