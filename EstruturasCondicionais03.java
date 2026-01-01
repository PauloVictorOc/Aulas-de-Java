public class EstruturasCondicionais03 {
    public static void main (String[] args){
        //Doar se salariio for > 5000
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 para o Dev";
        String mensagemNDoar = "Doação não disponivel";
        //(condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNDoar;
        System.out.println(resultado);
    }
}
/* OutroModoDeCondição - IF e ELSE
    if(salario > 5000){
        resultado = mensagemDoar;
        }
    else(salario < 5000){
        resultado = mensagemNDoar;
        }
*/