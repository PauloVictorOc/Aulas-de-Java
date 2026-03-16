package javacore.introducaoclasses.Bintroducaometodos.test;

import javacore.introducaoclasses.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10,2);
        System.out.println(result);
    }
}
