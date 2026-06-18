package com.fintech.loanservice;

import com.fintech.loanservice.application.LoanService;
import com.fintech.loanservice.domain.Loan;
import com.fintech.loanservice.infrastructure.LoanController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import static org.mockito.Mockito.*;

@WebFluxTest(LoanController.class)
public class LoanControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private LoanService loanService;

    @BeforeEach
    public void setUp() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        when(loanService.getAllLoans()).thenReturn(Flux.just(loan));
        when(loanService.getLoanById(1L)).thenReturn(Mono.just(loan));
        when(loanService.createLoan(loan)).thenReturn(Mono.just(loan));
        when(loanService.updateLoanStatus(1L, "Approved")).thenReturn(Mono.just(loan));
    }

    @Test
    public void testGetAllLoans() {
        webTestClient.get().uri("/api/loans")
               .accept(MediaType.APPLICATION_JSON)
               .exchange()
               .expectStatus().isOk()
               .expectBodyList(Loan.class).hasSize(1);
    }

    @Test
    public void testGetLoanById() {
        webTestClient.get().uri("/api/loans/1")
               .accept(MediaType.APPLICATION_JSON)
               .exchange()
               .expectStatus().isOk()
               .expectBody(Loan.class);
    }

    @Test
    public void testCreateLoan() {
        Loan loan = new Loan("John Doe", 1000.0, "Pending");
        webTestClient.post().uri("/api/loans")
               .contentType(MediaType.APPLICATION_JSON)
               .bodyValue(loan)
               .exchange()
               .expectStatus().isCreated()
               .expectBody(Loan.class);
    }

    @Test
    public void testUpdateLoanStatus() {
        webTestClient.put().uri("/api/loans/1?status=Approved")
               .accept(MediaType.APPLICATION_JSON)
               .exchange()
               .expectStatus().isOk()
               .expectBody(Loan.class);
    }
}