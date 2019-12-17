package com.asasan.paymentmanagement.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PaymentStatus {
    @JsonProperty("Successful")
    SUCCESSFUL,
    @JsonProperty("Failed")
    FAILED
}
