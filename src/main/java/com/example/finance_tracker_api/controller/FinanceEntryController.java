package com.example.finance_tracker_api.controller;

import com.example.finance_tracker_api.entity.FinanceEntry;
import com.example.finance_tracker_api.service.FinanceEntryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class FinanceEntryController {
    private final FinanceEntryService service;

    public FinanceEntryController(FinanceEntryService service) {
        this.service = service;
    }
}
