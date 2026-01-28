package com.example.finance_tracker_api.controller;

import com.example.finance_tracker_api.dto.FinanceEntryRequestDto;
import com.example.finance_tracker_api.dto.FinanceEntryResponseDto;
import com.example.finance_tracker_api.entity.FinanceEntry;
import com.example.finance_tracker_api.payload.ApiResponse;
import com.example.finance_tracker_api.service.FinanceEntryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class FinanceEntryController {
    private final FinanceEntryService service;

    public FinanceEntryController(FinanceEntryService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<ApiResponse<FinanceEntryResponseDto>> create(@Valid @RequestBody FinanceEntryRequestDto req) {
        FinanceEntryResponseDto dto = service.create(req);
        return ResponseEntity.status(201).body(
                new ApiResponse<>( 201, "Created new entry", dto)
        );
    }
}
