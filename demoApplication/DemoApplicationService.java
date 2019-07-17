package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DemoApplicationService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createOrder(String orderId) {
        System.out.println("createOrder");
        jdbcTemplate.update("INSERT INTO `test`.`order` (`orderId`) VALUES (?);", orderId);
        System.out.println("订单添加成功！！");
    }

}
