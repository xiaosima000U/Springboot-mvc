package com.lzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Forward {

    @RequestMapping("/index")
    public String index() {
        System.out.println(1234);
        return "/index";
    }
}