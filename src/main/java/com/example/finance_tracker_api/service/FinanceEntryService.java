package com.example.finance_tracker_api.service;

import com.example.finance_tracker_api.dto.FinanceEntryRequestDto;
import com.example.finance_tracker_api.dto.FinanceEntryResponseDto;
import com.example.finance_tracker_api.entity.FinanceEntry;
import com.example.finance_tracker_api.mapper.FinanceEntryMapper;
import com.example.finance_tracker_api.repository.FinanceEntryRepository;
import org.springframework.stereotype.Service;

@Service
public class FinanceEntryService {
    private final FinanceEntryRepository repository;

    public FinanceEntryService(FinanceEntryRepository repository) {
        this.repository = repository;
    }

    public FinanceEntryResponseDto create(FinanceEntryRequestDto req) {
        FinanceEntry entry = FinanceEntryMapper.toEntity(req);
        FinanceEntry saved = repository.save(entry);
        return FinanceEntryMapper.toResponse(saved);
    }


}
