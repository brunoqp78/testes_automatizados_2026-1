package org.iftm.sistema.entities;

public class Pessoa {
    private String nome;
    private String sobrenome;
    
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String retornarNomeCompleto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retornarNomeCompleto'");
    }

    public String retornarIniciais() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retornarIniciais'");
    }


    
}
