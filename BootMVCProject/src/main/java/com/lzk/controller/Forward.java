package com.lzk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class Forward {
    private static final Logger logger = LoggerFactory.getLogger(Forward.class);
    @RequestMapping("/index")
    public String index() {
        logger.info("1234");
        System.out.println(1234);
        return "/index";
    }
}