package com.asasan.paymentmanagement.app.service;

import com.asasan.paymentmanagement.api.dto.PaymentDto;
import com.asasan.paymentmanagement.api.dto.UserDetailDto;

public interface PaymentService {
    PaymentDto performPayment(int orderId, UserDetailDto userDetailDto);
}
