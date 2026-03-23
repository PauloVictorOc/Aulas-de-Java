package javacore.introducaoclasses.Bintroducaometodos.test;

import javacore.introducaoclasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    calculadora.somaDoisNumeros();
    calculadora.subtraDoisNumeros();
        System.out.println("---------");
        calculadora.imprimeDivisaoDoisNumeros(10,0);
        System.out.println("Final Test: CalculadoraTest01");
    }
}
