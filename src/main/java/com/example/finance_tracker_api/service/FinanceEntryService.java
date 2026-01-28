package com.example.finance_tracker_api.service;

import com.example.finance_tracker_api.dto.FinanceEntryRequestDto;
import com.example.finance_tracker_api.dto.FinanceEntryResponseDto;
import com.example.finance_tracker_api.entity.FinanceEntry;
import com.example.finance_tracker_api.mapper.FinanceEntryMapper;
import com.example.finance_tracker_api.repository.FinanceEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceEntryService {
    private final FinanceEntryRepository repository;

    public FinanceEntryService(FinanceEntryRepository repository) {
        this.repository = repository;
    }

    public FinanceEntryResponseDto createEntry(FinanceEntryRequestDto req) {
        FinanceEntry entry = FinanceEntryMapper.toEntity(req);
        FinanceEntry saved = repository.save(entry);
        return FinanceEntryMapper.toResponse(saved);
    }

    public List<FinanceEntryResponseDto> getAllEntries() {
        List<FinanceEntry> entries = repository.findAll();
        return entries.stream().map(FinanceEntryMapper::toResponse).toList();
    }

    public FinanceEntryResponseDto getEntryById(Long id) {
        FinanceEntry entry = repository.findById(id)
                            .orElseThrow(() -> new RuntimeException("Entry not found with id: " + id));
        return FinanceEntryMapper.toResponse(entry);
    }

    public FinanceEntryResponseDto updateEntryById(FinanceEntryRequestDto req, Long id) {
        FinanceEntry entry = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Entry not found with id: " + id));
        entry.setAmount(req.getAmount());
        entry.setType(req.getType());
        entry.setDescription(req.getDescription());
        entry.setDate(req.getDate());
        entry.setCategory(req.getCategory());

        FinanceEntry updated = repository.save(entry);
        return FinanceEntryMapper.toResponse(updated);
    }
}
