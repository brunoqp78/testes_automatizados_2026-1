package org.iftm.selenium_webdriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GerenciadorVeterinarioTest {
    private WebDriver driver;

    @BeforeEach
    public void setup(){
        //configurando o Chrome para teste
        WebDriverManager.chromedriver().setup();
        //definindo que meu WebDriver é relacionado ao navegador Chrome
        driver = new ChromeDriver();
    }

    /**
     * Cenário de Teste : verificar se a Tela principal do Gerenciador de Veterinários carrega os dados atuais do Banco de Dados.
     * BD:
     * INSERT INTO tb_veterinario (nome, email, especialidade, salario) VALUES('Conceição Evaristo', 'conceicao@gmail.com', 'pequenos', 3500.0);
     * INSERT INTO tb_veterinario (nome, email, especialidade, salario) VALUES('Erica Queiroz Pinto', 'erica@gmail.com', 'grandes', 4500.0);
     */
    @Test
    public void testarTelaInicialCarregaDadosExistentesNoBD(){
        //Arrange
        String urlTestada = "http://localhost:8080/home";
        String nomePrimeiraLinha= "Conceição Evaristo";
        String nomeSegundaLinha= "Erica Queiroz Pinto";
        String tituloPagina = "Gerenciador de Veterinários";

        //Act
        driver.get(urlTestada);
        assertEquals(tituloPagina, driver.getTitle());
        //capturar o elemento relacionado a primeira linha da tabela e primeira coluna
        WebElement primeiroNomeTabela = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)"));
        WebElement segundoNomeTabela = driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)"));
        assertEquals(nomePrimeiraLinha, primeiroNomeTabela.getText());
        assertEquals(nomeSegundaLinha, segundoNomeTabela.getText());
    }

    @AfterEach
    public void exit(){
        driver.close();
    }
}
