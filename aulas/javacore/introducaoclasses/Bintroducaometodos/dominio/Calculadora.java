package javacore.introducaoclasses.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(8+7);
    }
    public void subtraDoisNumeros(){
        System.out.println(8-7);
    }
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        /*
        if (num2 == 0)
            return 0;
        else {
            return (int) (num1 / num2);
        }

        if (num2 == 0){
            return num1/num2;
          }
          return 0;
         */
        return num1/num2;
    }
    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("NãoExisteDivisãoPor:0");
            return;
        }
        System.out.println(num1 / num2);
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 1054;
        num2 = 7560;
        System.out.println("AlteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
    public void somaArray(int[] numeros){
     int soma = 0;
     for(int num: numeros){
        soma += num;
     }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
