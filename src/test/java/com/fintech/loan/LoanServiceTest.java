package com.fintech.loan;

import com.fintech.loan.application.LoanService;
import com.fintech.loan.domain.Loan;
import com.fintech.loan.infrastructure.LoanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoanServiceTest {

    @Autowired
    private LoanService loanService;

    @MockBean
    private LoanRepository loanRepository;

    @Test
    void testApplyForLoan() {
        Loan loan = new Loan();
        loan.setUserId("user123");
        loan.setAmount(10000);
        loan.setInterestRate(5.0);
        loan.setTerm(12);
        loan.setStatus("Pending");

        Loan savedLoan = loanService.applyForLoan(loan);

        assertNotNull(savedLoan);
        assertEquals("user123", savedLoan.getUserId());
        assertEquals(10000, savedLoan.getAmount(), 0.01);
        assertEquals(5.0, savedLoan.getInterestRate(), 0.01);
        assertEquals(12, savedLoan.getTerm());
        assertEquals("Pending", savedLoan.getStatus());
    }

    @Test
    void testCheckEligibility() {
        Loan loan = new Loan();
        loan.setUserId("user123");
        loan.setAmount(10000);
        loan.setInterestRate(5.0);
        loan.setTerm(12);
        loan.setStatus("Eligible");

        Loan checkedLoan = loanService.checkEligibility(loan);

        assertNotNull(checkedLoan);
        assertEquals("user123", checkedLoan.getUserId());
        assertEquals(10000, checkedLoan.getAmount(), 0.01);
        assertEquals(5.0, checkedLoan.getInterestRate(), 0.01);
        assertEquals(12, checkedLoan.getTerm());
        assertEquals("Eligible", checkedLoan.getStatus());
    }
}