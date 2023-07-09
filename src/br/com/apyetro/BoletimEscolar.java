package br.com.apyetro;

public class BoletimEscolar {

    public static void main(String []args){
        System.out.println("*Primeiro Semestre*");
        Aluno aluno = new Aluno();
        aluno.setCodigo(1);
        aluno.setNome("Anderson Pyetro");
        aluno.setMateria("Matematica");
        System.out.println("Materia: " + aluno.getMateria());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Codigo de Aluno: " + aluno.getCodigo());

        int nota1 = 9;
        double nota2 = 5.5;
        double nota3 = 8.7;
        int nota4 = 10;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Media: " + media);

        if (media >= 7) {
            System.out.println("Situacao: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situacao: Recuperacao");
        } else {
            System.out.println("Situacao: Reprovado");
        }
    }
}



