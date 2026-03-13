package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
    Professor professor = new Professor();
    professor.nome = "Kakashi";
    professor.sexo = 'M';
    professor.idade = 28;

        System.out.println("Nome: " + professor.nome + "\n" + "Sexo: " + professor.sexo + "\n" + "Idade: " + professor.idade);
    }
}
