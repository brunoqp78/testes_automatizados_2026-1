
package org.iftm.sistema.servicies;

import org.iftm.sistema.entities.Pessoa;

class GeradorCracha {
    private GerenciadorImpressora gerenciadorImpressora;

    public GeradorCracha(GerenciadorImpressora gerenciadorImpressora) {
        this.gerenciadorImpressora = gerenciadorImpressora;
    }

    public void gerarPara(Pessoa pessoa) {
        if (!gerenciadorImpressora.estaConectado()){
            throw new IllegalStateException("Impressora OffLine!!!");
        }
        int retorno = gerenciadorImpressora.imprimir(pessoa.retornarNomeCompleto(), pessoa.retornarIniciais());
        if (retorno == 2){
            throw new IllegalStateException("Impressora apresenta falha mecânica!!!");
        }
    }

}
