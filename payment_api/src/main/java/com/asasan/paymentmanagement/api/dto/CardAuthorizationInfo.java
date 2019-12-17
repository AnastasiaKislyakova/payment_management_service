package com.asasan.paymentmanagement.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CardAuthorizationInfo {
    @JsonProperty("Authorized")
    AUTHORIZED,
    @JsonProperty("Authorized")
    UNAUTHORIZED
}
