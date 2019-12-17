package com.asasan.paymentmanagement.api.feign;

import com.asasan.paymentmanagement.api.dto.PaymentDto;
import com.asasan.paymentmanagement.api.dto.UserDetailDto;
import com.asasan.paymentmanagement.api.service.PaymentManagementServiceApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("${order.management.service.name}/api/payment")
public interface PaymentManagementServiceClient extends PaymentManagementServiceApi {
    @GetMapping(value = "{orderId}")
    PaymentDto performPayment(@PathVariable int orderId, UserDetailDto userDetailDto);
}
