package com.fintech.loanservice.application;

import com.fintech.loanservice.domain.Loan;
import com.fintech.loanservice.infrastructure.LoanRepository;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Flux<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Mono<Loan> getLoanById(Long id) {
        return loanRepository.findById(id);
    }

    public Mono<Loan> createLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public Mono<Loan> updateLoanStatus(Long id, String status) {
        return loanRepository.findById(id)
               .flatMap(loan -> {
                    loan.setStatus(status);
                    return loanRepository.save(loan);
                });
    }
}