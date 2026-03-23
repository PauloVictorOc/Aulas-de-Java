package javacore.introducaoclasses.Bintroducaometodos.test;

import javacore.introducaoclasses.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nero");
        funcionario.setCpf(1234);
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1700, 4200, 2000});

        funcionario.imprime();
        System.out.println("Media: "+funcionario.getMedia());

    }
}
