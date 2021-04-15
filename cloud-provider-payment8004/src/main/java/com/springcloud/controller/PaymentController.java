package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description:
 * @ClassName： PaymentController
 * @Author: hs
 * @Time: 2021/4/9 0:45
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private Integer serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentZk(){
        return "springcloud with cloudcloud:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
