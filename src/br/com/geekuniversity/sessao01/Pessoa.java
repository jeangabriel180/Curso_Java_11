package br.com.geekuniversity.sessao01;

public class Pessoa {
    String nome, email;
    int ano_nascimento;

    public Pessoa() {

    }

    public Pessoa(String nome, String email, int ano_nascimento){
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprime_informacoes(){
        System.out.println(this.ano_nascimento);
        System.out.println(this.nome);
        System.out.println(this.email);
    }
}
