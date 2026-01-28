package com.example.finance_tracker_api.repository;

import com.example.finance_tracker_api.entity.FinanceEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceEntryRepository extends JpaRepository<FinanceEntry, Long> { }
