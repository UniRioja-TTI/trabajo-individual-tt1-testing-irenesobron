package com.tt1.trabajo;

import modelo.Destinatario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import servicios.EnviarEmailsService;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class EnviarEmailsServiceTest {
    private EnviarEmailsService service;
    private Logger log;

    @BeforeEach
    void setUp() {
        log = Logger.getLogger(EnviarEmailsService.class.getName());
        service = new EnviarEmailsService(log);
    }
    @AfterEach
    void tearDown() {
        service = null;
        log = null;
    }

    @Test
    void enviarEmail() {
        assertTrue(service.enviarEmail(new Destinatario(), "Test para EmailService"));
    }
}
