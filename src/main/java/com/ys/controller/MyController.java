package com.ys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @ResponseBody
    @RequestMapping("/secondController")
    public String secondController(){
        return "hello springboot02 sy";
    }
}
