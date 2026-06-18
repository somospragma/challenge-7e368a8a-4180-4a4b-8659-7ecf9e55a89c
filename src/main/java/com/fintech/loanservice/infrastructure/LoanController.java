package com.fintech.loanservice.infrastructure;

import com.fintech.loanservice.application.LoanService;
import com.fintech.loanservice.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping
    public Flux<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Loan>> getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id)
               .map(loan -> new ResponseEntity<>(loan, HttpStatus.OK))
               .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Mono<Loan> createLoan(@RequestBody Loan loan) {
        return loanService.createLoan(loan);
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<Loan>> updateLoanStatus(@PathVariable Long id, @RequestParam String status) {
        return loanService.updateLoanStatus(id, status)
               .map(loan -> new ResponseEntity<>(loan, HttpStatus.OK))
               .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}