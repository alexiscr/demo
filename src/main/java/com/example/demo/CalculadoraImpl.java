package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraImpl implements Calculadora {

    @Override
    public int dividir(int num1, int num2) {

        if(num2 == 0)
            return 0;

            return num1 / num2;
    }
}
