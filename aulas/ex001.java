/*
 * Prática 001 
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem no console:
 * 
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class ex001 {
    public static void main(String[] args) {
        String nome = "Ryu";
        String endereco = "Rua dos Bobos, 0";
        double salario = 2500.50;
        String dataSalario = "01/01/2024";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataSalario + ".");
    }
}
