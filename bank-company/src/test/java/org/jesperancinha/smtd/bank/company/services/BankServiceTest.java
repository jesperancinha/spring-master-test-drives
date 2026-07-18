package org.jesperancinha.smtd.bank.company.services;


import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;
import org.jesperancinha.smtd.bank.company.configuration.BankCompanyTestForLazyConfiguraton;
import org.jesperancinha.smtd.bank.company.model.Bank;
import org.jesperancinha.smtd.bank.company.repository.BankCompanyBankRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.parallel.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;
import static org.mockito.Mockito.when;

@Lazy
@SpringBootTest
@ContextConfiguration(classes = {BankService.class, BankCompanyTestForLazyConfiguraton.class})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankServiceTest {

    @MockitoBean
    private BankCompanyBankRepository bankCompanyBankRepository;

    @Autowired
    private BankService bankService;

    @Lazy
    @Autowired(required = false)
    private Bank bank;

    @BeforeEach
    public void setup() {
        ConsolerizerComposer.outSpace().magenta("We just started our unit test").reset();
    }

    @Test
    @Execution(SAME_THREAD)
    @Order(1)
    public void testCountBanksWhenCalleThenGetExpectedCount() {
        when(bankCompanyBankRepository.countAllByIdAfter(0L)).thenReturn(5L);

        final var locationCount = bankService.countLocations();

        ConsolerizerComposer.outSpace().magenta("We are in the middle of our test").reset();
        assertThat(locationCount).isEqualTo(5L);
        assertThat(bank).isNotNull();
    }

    @Test
    @Execution(SAME_THREAD)
    @Order(2)
    public void testCountBanksWhenCalleThenGetExpectedCountVersion2() {
        when(bankCompanyBankRepository.countAllByIdAfter(0L)).thenReturn(5L);

        final var locationCount = bankService.countLocations();

        ConsolerizerComposer.outSpace().magenta("We are in the middle of our test").reset();
        assertThat(locationCount).isEqualTo(5L);
    }
}
