package com.vesalukkarila.simple.webapp.springboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class InvoiceDto {

    @JsonProperty("user_id")
    @NotBlank
    private  String userId;
    @Min(10)
    @Max(40)
    private Integer amount;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public Integer getAmount() {
        return amount;
    }
}
