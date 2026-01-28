package com.example.finance_tracker_api.service;

import com.example.finance_tracker_api.repository.FinanceEntryRepository;

public class FinanceEntryService {
    private final FinanceEntryRepository repository;

    public FinanceEntryService(FinanceEntryRepository repository) {
        this.repository = repository;
    }

}
