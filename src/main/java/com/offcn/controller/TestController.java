package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 演示springsession的使用
 */
@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession session){

        session.setAttribute("msg","hello");

        return "OK";

    }


    @GetMapping("/get")
    public String getSession(HttpSession session){
        return  (String)session.getAttribute("msg");

    }
}
