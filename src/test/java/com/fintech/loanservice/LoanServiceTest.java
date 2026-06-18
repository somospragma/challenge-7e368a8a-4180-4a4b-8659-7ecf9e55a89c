package com.fintech.loanservice;

import com.fintech.loanservice.application.LoanService;
import com.fintech.loanservice.domain.Loan;
import com.fintech.loanservice.infrastructure.LoanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import static org.mockito.Mockito.*;

public class LoanServiceTest {
    private LoanService loanService;
    private LoanRepository loanRepository;

    @BeforeEach
    public void setUp() {
        loanRepository = Mockito.mock(LoanRepository.class);
        loanService = new LoanService(loanRepository);
    }

    @Test
    public void testGetAllLoans() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        Flux<Loan> loanFlux = Flux.just(loan);
        when(loanRepository.findAll()).thenReturn(loanFlux);

        StepVerifier.create(loanService.getAllLoans())
               .expectNext(loan)
               .verifyComplete();
    }

    @Test
    public void testCreateLoan() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        when(loanRepository.save(loan)).thenReturn(Mono.just(loan));

        StepVerifier.create(loanService.createLoan(loan))
               .expectNext(loan)
               .verifyComplete();
    }

    @Test
    public void testUpdateLoanStatus() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        when(loanRepository.findById(1L)).thenReturn(Mono.just(loan));
        when(loanRepository.save(loan)).thenReturn(Mono.just(loan));

        StepVerifier.create(loanService.updateLoanStatus(1L, "Approved"))
               .expectNext(loan)
               .verifyComplete();
    }
}