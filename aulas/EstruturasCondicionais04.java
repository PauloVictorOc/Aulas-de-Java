public class EstruturasCondicionais04 {
    public static void main(String[] args){
        //Income Bracket 	Tax Rate
        //Up to €38,441	            35.82%
        //From €38,441 to €76,817	37.48%
        //Above €76,817	            49.50%
        double salarioAnual = 70000;
        double primeiraFaixa = 35.82 / 100;
        double segundaFaixa = 37.48 / 100;
        double teceiraFaixa = 49.5 / 100;
        double valorImposto;

        if (salarioAnual <= 38441){
            valorImposto = salarioAnual * primeiraFaixa;
        }
        else if (salarioAnual >= 38441 && salarioAnual <=76817) {
            valorImposto = salarioAnual * segundaFaixa;
        }
        else {
            valorImposto = salarioAnual * teceiraFaixa;
        }
        System.out.println(valorImposto);

    }
}
/*outroModoDeInserir
    salarioAnual *= faixaSalarial ---> reduz a linha e o executa o comando de multiplicação
    caso não haja valor do imposto
 */