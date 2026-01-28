package com.example.finance_tracker_api.controller;

import com.example.finance_tracker_api.dto.FinanceEntryRequestDto;
import com.example.finance_tracker_api.dto.FinanceEntryResponseDto;
import com.example.finance_tracker_api.entity.FinanceEntry;
import com.example.finance_tracker_api.payload.ApiResponse;
import com.example.finance_tracker_api.service.FinanceEntryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class FinanceEntryController {
    private final FinanceEntryService service;

    public FinanceEntryController(FinanceEntryService service) {
        this.service = service;
    }

    @PostMapping("/entries")
    public ResponseEntity<ApiResponse<FinanceEntryResponseDto>> createEntry(@Valid @RequestBody FinanceEntryRequestDto req) {
        FinanceEntryResponseDto dto = service.createEntry(req);
        return ResponseEntity.status(201).body(
                new ApiResponse<>( 201, "Created new entry", dto)
        );
    }

    @GetMapping("/entries")
    public ResponseEntity<ApiResponse<List<FinanceEntryResponseDto>>> getAllEntries() {
        List<FinanceEntryResponseDto> dto = service.getAllEntries();
        return ResponseEntity.ok(
                new ApiResponse<>(200, "All entries fetched", dto)
        );
    }

    @GetMapping("/entries/{id}")
    public ResponseEntity<ApiResponse<FinanceEntryResponseDto>> getEntryById(@PathVariable Long id) {
        FinanceEntryResponseDto dto = service.getEntryById(id);
        return ResponseEntity.ok(
                new ApiResponse<>(200, "Fetched entry by id", dto)
        );
    }
}
