package com.asasan.paymentmanagement.app.service.impl;

import com.asasan.ordermanagement.api.dto.OrderStatus;
import com.asasan.ordermanagement.api.feign.OrderManagementServiceClient;
import com.asasan.ordermanagement.api.service.OrderManagementServiceApi;
import com.asasan.ordermanagement.queue.ChangeStatusQueue;
import com.asasan.ordermanagement.queue.ChangeStatusTask;
import com.asasan.paymentmanagement.api.dto.CardAuthorizationInfo;
import com.asasan.paymentmanagement.api.dto.PaymentDto;
import com.asasan.paymentmanagement.api.dto.PaymentStatus;
import com.asasan.paymentmanagement.api.dto.UserDetailDto;
import com.asasan.paymentmanagement.app.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PaymentServiceImpl implements PaymentService {
    private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);

    private ChangeStatusQueue changeStatusQueue;

    @Autowired
    public PaymentServiceImpl(ChangeStatusQueue changeStatusQueue){
        this.changeStatusQueue = changeStatusQueue;
    }

    @Override
    public PaymentDto performPayment(int orderId, UserDetailDto userDetailDto) {
        OrderStatus orderStatus = OrderStatus.FAILED;
        PaymentStatus paymentStatus = PaymentStatus.FAILED;
        if (userDetailDto.getCardAuthorizationInfo() == CardAuthorizationInfo.AUTHORIZED) {
            orderStatus = OrderStatus.PAID;
            paymentStatus = PaymentStatus.SUCCESSFUL;
        }
        try {
            changeStatusQueue.put(new ChangeStatusTask(orderId, orderStatus));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new PaymentDto(orderId, userDetailDto.getUsername(), paymentStatus);
    }
}
