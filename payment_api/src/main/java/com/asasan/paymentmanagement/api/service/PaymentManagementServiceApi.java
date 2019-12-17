package com.asasan.paymentmanagement.api.service;

import com.asasan.paymentmanagement.api.dto.CardAuthorizationInfo;
import com.asasan.paymentmanagement.api.dto.PaymentDto;
import com.asasan.paymentmanagement.api.dto.UserDetailDto;

public interface PaymentManagementServiceApi {
    PaymentDto performPayment(int orderId, UserDetailDto userDetailDto);
}
