package com.example.finance_tracker_api.dto;


import com.example.finance_tracker_api.entity.FinanceEntryType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.Date;

public class FinanceEntryRequestDto {
    @NotNull
    @Positive
    private double amount;

    @NotBlank
    private String category;

    @NotNull
    private Date date;

    private String description;

    @NotNull
    private FinanceEntryType type;
}
