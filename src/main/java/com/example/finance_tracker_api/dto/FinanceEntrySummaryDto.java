package com.example.finance_tracker_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceEntrySummaryDto {
    private double totalIncome;
    private double totalExpense;
}
