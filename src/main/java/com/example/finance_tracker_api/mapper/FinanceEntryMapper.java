package com.example.finance_tracker_api.mapper;

import com.example.finance_tracker_api.dto.*;
import com.example.finance_tracker_api.entity.FinanceEntry;
import com.example.finance_tracker_api.entity.FinanceEntryType;

public class FinanceEntryMapper {

    public static FinanceEntry toEntity(FinanceEntryRequestDto dto) {
        FinanceEntry entry = new FinanceEntry();
        entry.setAmount(dto.getAmount());
        entry.setCategory(dto.getCategory());
        entry.setDate(dto.getDate());
        entry.setDescription(dto.getDescription());
        entry.setType(dto.getType());
        System.out.println(entry.getAmount());
        return entry;
    }

    public static FinanceEntryResponseDto toResponse(FinanceEntry entry) {
        FinanceEntryResponseDto dto = new FinanceEntryResponseDto();
        dto.setAmount(entry.getAmount());
        dto.setCategory(entry.getCategory());
        dto.setDate(entry.getDate());
        dto.setDescription(entry.getDescription());
        dto.setType(entry.getType());
        return dto;
    }
}
