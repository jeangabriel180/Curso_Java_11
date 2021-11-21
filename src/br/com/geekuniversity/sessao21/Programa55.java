package br.com.geekuniversity.sessao21;

//armazenamento sequencial

/*

 */

public class Programa55 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Angelina");
        Aluno a2 = new Aluno("Felicity");

        Vetor lista = new Vetor();

        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(a1);
        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(a2);
        System.out.println("Total de alunos: " + lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(a1));

        try {
            System.out.println(lista.pega(120));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Aluno a3 = new Aluno("Maria");

        try {
            lista.adiciona(a3, 101);
        }catch (IllegalArgumentException e){
            System.out.println("A posição 101 é invalida");
        }

        lista.remove(0);

        System.out.println(lista);


    }
}
