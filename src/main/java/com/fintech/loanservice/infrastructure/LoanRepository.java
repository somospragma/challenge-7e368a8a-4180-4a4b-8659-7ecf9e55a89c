package com.fintech.loanservice.infrastructure;

import com.fintech.loanservice.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    Flux<Loan> findAll();
    Mono<Loan> findById(Long id);
    Mono<Loan> save(Loan loan);
}