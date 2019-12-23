package com.asasan.paymentmanagement.api.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PaymentDto {
    int orderId;
    String username;
    PaymentStatus paymentStatus;
}
