package com.example.finance_tracker_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@jakarta.persistence.Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FinanceEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = true)
    private String description;

    @Column
    private FinanceEntryType type;
}
