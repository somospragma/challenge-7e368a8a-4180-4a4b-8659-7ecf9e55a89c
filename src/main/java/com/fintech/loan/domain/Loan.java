package com.fintech.loan.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan {
    @Id
    private Long id;
    private String userId;
    private double amount;
    private double interestRate;
    private int term;
    private String status;

    // Constructors, getters, and setters
}