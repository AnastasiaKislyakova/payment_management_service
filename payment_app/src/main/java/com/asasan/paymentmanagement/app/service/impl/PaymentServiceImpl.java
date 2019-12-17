package com.asasan.paymentmanagement.app.service.impl;

import com.asasan.paymentmanagement.api.dto.PaymentDto;
import com.asasan.paymentmanagement.api.dto.UserDetailDto;
import com.asasan.paymentmanagement.app.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);
//
//    @Autowired
//    public PaymentServiceImpl(){}

    @Override
    public PaymentDto performPayment(int orderId, UserDetailDto userDetailDto) {
        return null;
    }
}
