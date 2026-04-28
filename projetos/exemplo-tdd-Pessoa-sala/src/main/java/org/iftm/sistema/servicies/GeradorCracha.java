
package org.iftm.sistema.servicies;

import org.iftm.sistema.entities.Pessoa;

class GeradorCracha {
    private GerenciadorImpressora gerenciadorImpressora;

    public GeradorCracha(GerenciadorImpressora gerenciadorImpressora) {
        this.gerenciadorImpressora = gerenciadorImpressora;
    }

    public void gerarPara(Pessoa pessoa) {
        gerenciadorImpressora.imprimir(pessoa.retornarNomeCompleto(), pessoa.retornarIniciais());
    }

}
