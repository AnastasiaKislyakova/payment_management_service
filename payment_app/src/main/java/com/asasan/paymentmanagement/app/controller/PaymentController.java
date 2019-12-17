package com.asasan.paymentmanagement.app.controller;

import com.asasan.paymentmanagement.api.dto.PaymentDto;
import com.asasan.paymentmanagement.api.dto.UserDetailDto;
import com.asasan.paymentmanagement.app.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/payment")
public class PaymentController {
    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) { this.paymentService = paymentService; }

    @GetMapping(value = "{orderId}")
    PaymentDto performPayment(@PathVariable int orderId, UserDetailDto userDetailDto) {
        return paymentService.performPayment(orderId, userDetailDto);
    }
}
