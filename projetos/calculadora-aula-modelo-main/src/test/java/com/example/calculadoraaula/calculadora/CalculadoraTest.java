package com.example.calculadoraaula.calculadora;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private static Calculadora calculadoraTestada;

    @BeforeAll
    private static void setupPrincipal(){
        System.out.println("Começou os testes!!!");
        calculadoraTestada = new Calculadora();
    }

    @BeforeEach
    private void setup(){
        System.out.println("Inicio de um teste!!!");        
    }

    @AfterEach
    private void fim(){
        System.out.println("terminou de um teste!!!");
    }

    @Test
    public void testeSomaNumerosPositivos(){
        //arrange
        int entradaNumero1 = 2;
        int entradaNumero2 = 3;
        int resultadoEsperado = 5;

        //Act
        int resultadoRealObtido = calculadoraTestada.somar(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido);
    }

     @Test
    public void testeSomaNumerosPositivoNegativo(){
        //arrange
        int entradaNumero1 = 5;
        int entradaNumero2 = -3;
        int resultadoEsperado = 2;

        //Act
        int resultadoRealObtido = calculadoraTestada.somar(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeSubtrairNumerosPositivos(){
        //arrange
        int entradaNumero1 = 5;
        int entradaNumero2 = 3;
        int resultadoEsperado = 2;

        //Act
        int resultadoRealObtido = calculadoraTestada.subtrair(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido, "A subtração entre dois números positivos não retornou a resposta esperada!!!!");
    }

    @Test
    public void testeSubtrairUmNumeroNegativo(){
        //arrange
        int entradaNumero1 = 3;
        int entradaNumero2 = -2;
        int resultadoEsperado = 5;

        //Act
        int resultadoRealObtido = calculadoraTestada.subtrair(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido);
    }    

    @Test
    public void testeMultiplicarNumerosPositivos(){
        //arrange
        int entradaNumero1 = 2;
        int entradaNumero2 = 3;
        int resultadoEsperado = 6;

        //Act
        int resultadoRealObtido = calculadoraTestada.multiplicar(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeMultiplicarPorZero(){
        //arrange
        int entradaNumero1 = 5;
        int entradaNumero2 = 0;
        int resultadoEsperado = 0;

        //Act
        int resultadoRealObtido = calculadoraTestada.multiplicar(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeDividirSemGerarResto(){
        //arrange
        int entradaNumero1 = 6;
        int entradaNumero2 = 3;
        int resultadoEsperado = 2;

        //Act
        int resultadoRealObtido = calculadoraTestada.dividir(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido);
    }

    @Test
    public void testeDividirGerandoResto(){
        //arrange
        int entradaNumero1 = 5;
        int entradaNumero2 = 2;
        int resultadoEsperado = 2;

        //Act
        int resultadoRealObtido = calculadoraTestada.dividir(entradaNumero1, entradaNumero2);

        //Assert
        assertEquals(resultadoEsperado, resultadoRealObtido);
    }   
    
    @Test
    public void testeDividirPorZero(){
        //arrange
        int entradaNumero1 = 5;
        int entradaNumero2 = 0;
        String mensagemErroEsperada = "Erro: divisão por zero!!!";

        //Act e Assert
        Throwable e = assertThrows(IllegalArgumentException.class, ()->{
            calculadoraTestada.dividir(entradaNumero1, entradaNumero2);
        });

        assertEquals("Erro: divisão por zero!!!", e.getMessage());
    }   
    

}
