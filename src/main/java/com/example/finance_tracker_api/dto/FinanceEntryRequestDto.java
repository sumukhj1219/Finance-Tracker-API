package com.example.finance_tracker_api.dto;


import com.example.finance_tracker_api.entity.FinanceEntryType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FinanceEntryRequestDto {
    @NotNull
    @Positive
    private double amount;

    @NotBlank
    private String category;

    @NotNull
    private LocalDate date;

    private String description;

    @NotNull
    private FinanceEntryType type;
}
