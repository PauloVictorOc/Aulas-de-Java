package javacore.introducaoclasses.Bintroducaometodos.test;
import javacore.introducaoclasses.Bintroducaometodos.dominio.Calculadora;
public class CalculadoraTest04 {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();
       int a = 10;
       int b = 60;
       calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
