package org.iftm.atividadea2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    public void setup(){
        int memoriaInicial = 3;
        calculadora = new Calculadora(memoriaInicial);

    }

    @Test
    public void testarConstrutorVazioInicializaMemoriaZerada(){
        //Arrange
        int memoriaEsperada = 0;
        //Act
        calculadora = new Calculadora();
        int memoriaObtida = calculadora.getMemoria();

        //Assert
        assertEquals(memoriaEsperada, memoriaObtida);

    }

    @Test
    public void testarSomaNumeroInteiro(){
        //Arrange
        int valorASerSomado = 3;
        int memoriaEsperada = 6;

        //Act
        calculadora.somar(valorASerSomado);
        memoriaEsperada = calculadora.getMemoria();

        //Assert
    }
}
