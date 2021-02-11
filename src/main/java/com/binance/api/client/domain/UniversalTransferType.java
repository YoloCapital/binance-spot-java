package com.binance.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum UniversalTransferType {
    MAIN_MARGIN,
    MAIN_UMFUTURE,
    MAIN_CMFUTURE,
    MARGIN_MAIN,
    UMFUTURE_MAIN,
    CMFUTURE_MAIN,
}
