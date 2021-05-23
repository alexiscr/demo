package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
// Inicia el contenedor de Inyección
@SpringBootTest
class CalculadoraImplTest {

    // Realiza el maping de la Inyección
    @Autowired
    Calculadora calculadorService;

    @Test
    void dividirDosEnteros() {
        Assert.assertEquals(1, calculadorService.dividir(1,1));
    }

    @Test
    void noErrorAlDividirEntreCero(){
        Assert.assertEquals(0, calculadorService.dividir(1,0));
    }
}