package br.com.geekuniversity.sessao01;

public class Produto {
    String nome;
    float preco;
    float desconto;

    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    }
}
