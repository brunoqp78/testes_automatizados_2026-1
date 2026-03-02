package com.example.calculadoraaula.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testeSomaNumerosPositivos(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 2;
        int entradaNumero2 = 3;
        int resultadoEsperado = 5;

        //Act
        int resultadoRealObtido = calculadoraTestada.somar(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeSubtrairNumerosPositivos(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 5;
        int entradaNumero2 = 3;
        int resultadoEsperado = 2;

        //Act
        int resultadoRealObtido = calculadoraTestada.subtrair(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }

}
