 /*
    Tipos primitivos em Java:
    int: para números inteiros (ex: 1, 2, 3)
    double: para números de ponto flutuante (ex: 1.5, 2.0)
    char: para caracteres únicos (ex: 'a', 'b', 'c')
    boolean: para valores verdadeiros ou falsos (true, false)
    float: para números de ponto flutuante com precisão simples (ex: 1.5f, 2.0f)
    long: para números inteiros grandes (ex: 100000L, 200000L)
    short: para números inteiros pequenos (ex: 1000, 2000)
    byte: para números inteiros muito pequenos (ex: 10, 20)     
     */
public class TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 20;
         long numeroGrande = 100000;
        double salaroDouble = 2000;
        float salarioFloat = 2500.0f;
        byte idadeByte = 127;
        short idadeShort = 10;
        char letra = 'A';
        boolean verdadeiro = true;
        boolean falso = false;
        String nome = "João";
        System.out.println("Olá "+nome);
        System.out.println("A idade é: "+idade+" anos");
        System.out.println("Número grande: "+numeroGrande);
        System.out.println("Salário double: "+salaroDouble);
        System.out.println("Salário float: "+salarioFloat);
        System.out.println("Idade byte: "+idadeByte);
        System.out.println("Idade short: "+idadeShort);
        System.out.println("Letra: "+letra);
        System.out.println("Verdadeiro: "+verdadeiro);
        System.out.println("Falso: "+falso);
    }
}
