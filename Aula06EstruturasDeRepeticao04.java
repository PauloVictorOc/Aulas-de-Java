public class Aula06EstruturasDeRepeticao04 {
    /*
    Dado o valor de um carro, descubra até quantas vezes ele pode ser parcelado.
    Condição valorParcela >=1000
     */
    static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 6; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela"+ parcela + " R$"+valorParcela);
        }
    }
}
/* Outro modo de inserir:
            if (valorParcela >= 1000){
                System.out.println("Parcela"+ parcela +" R$"+valorParcela);
            }
            else {
                break;
            }
            System.out.println("Fora do if"+parcela);

 */
