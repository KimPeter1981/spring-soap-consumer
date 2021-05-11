package de.swkbank.passivsoap.soapinterface.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PassivWebServiceTest {

    @Autowired
    private PassivWebService passivWebService;

    @Test
    public void getBankTest() {
        passivWebService.getBank();
    }

}