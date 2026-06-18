package com.fintech.loan.application;

import com.fintech.loan.domain.Loan;
import com.fintech.loan.infrastructure.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public Loan applyForLoan(Loan loan) {
        // Business logic here
        return loanRepository.save(loan);
    }

    public Loan checkEligibility(Loan loan) {
        // Business logic here
        return loanRepository.save(loan);
    }
}