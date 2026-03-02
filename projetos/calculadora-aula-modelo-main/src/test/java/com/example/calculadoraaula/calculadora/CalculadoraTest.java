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
    public void testeSomaNumerosPositivoNegativo(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 5;
        int entradaNumero2 = -3;
        int resultadoEsperado = 2;

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
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido, "A subtração entre dois números positivos não retornou a resposta esperada!!!!");
    }

    @Test
    public void testeSubtrairUmNumeroNegativo(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 3;
        int entradaNumero2 = -2;
        int resultadoEsperado = 5;

        //Act
        int resultadoRealObtido = calculadoraTestada.subtrair(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }    

    @Test
    public void testeMultiplicarNumerosPositivos(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 2;
        int entradaNumero2 = 3;
        int resultadoEsperado = 6;

        //Act
        int resultadoRealObtido = calculadoraTestada.multiplicar(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeMultiplicarPorZero(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 5;
        int entradaNumero2 = 0;
        int resultadoEsperado = 0;

        //Act
        int resultadoRealObtido = calculadoraTestada.multiplicar(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeDividirSemGerarResto(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 6;
        int entradaNumero2 = 3;
        int resultadoEsperado = 2;

        //Act
        int resultadoRealObtido = calculadoraTestada.dividir(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeDividirGerandoResto(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 5;
        int entradaNumero2 = 2;
        int resultadoEsperado = 2;

        //Act
        int resultadoRealObtido = calculadoraTestada.dividir(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }   
    
    @Test
    public void testeDividirPorZero(){
        //arrange
        Calculadora calculadoraTestada = new Calculadora();
        int entradaNumero1 = 5;
        int entradaNumero2 = 0;
        int resultadoEsperado = -1;

        //Act
        int resultadoRealObtido = calculadoraTestada.dividir(entradaNumero1, entradaNumero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoRealObtido);
    }   
    

}
