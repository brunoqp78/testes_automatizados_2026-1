package com.example.calculadoraaula.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void teste1(){
        Assertions.assertEquals(5, (new Calculadora()).somar(2, 3));
    }

}
