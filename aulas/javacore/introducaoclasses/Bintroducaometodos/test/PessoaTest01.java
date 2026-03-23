package javacore.introducaoclasses.Bintroducaometodos.test;

import javacore.introducaoclasses.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Karin");
        pessoa.setIdade(30);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
