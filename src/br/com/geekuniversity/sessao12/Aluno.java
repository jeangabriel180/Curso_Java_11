package br.com.geekuniversity.sessao12;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String ra, int ano_nascimento, String nome, String email) {
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String toString() {
        return super.toString() + "\nRA: " + this.ra;
    }

    @Override
    public void outra_mensagem(String texto) {
        System.out.println(texto);
    }

    public String getNome(){
        return "Aluno: " + super.getNome();
    }
}
