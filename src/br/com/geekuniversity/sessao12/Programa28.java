package br.com.geekuniversity.sessao12;

public class Programa28 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("",1998,"soriegedom","@@");
        System.out.println(a1.getNome());
        Professor prof1 = new Professor("Pedro",1976,"aaa","@@@");
        System.out.println(prof1.getNome());

        System.out.println(a1);
        System.out.println(prof1);
    }
}
