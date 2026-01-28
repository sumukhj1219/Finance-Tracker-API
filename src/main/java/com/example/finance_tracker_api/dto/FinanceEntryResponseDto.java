package com.example.finance_tracker_api.dto;

import com.example.finance_tracker_api.entity.FinanceEntryType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FinanceEntryResponseDto {
    private double amount;
    private String category;
    private Date date;
    private String description;
    private FinanceEntryType type;
}
