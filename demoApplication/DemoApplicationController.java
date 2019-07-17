package com.example.demo.controller;

import com.example.demo.service.DemoApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {
    @Autowired
    private DemoApplicationService demoApplicationService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "hello world";
    }

    @RequestMapping("/createOrder")
    public String createOrder() {
        demoApplicationService.createOrder("1");
        return "success";
    }

}
