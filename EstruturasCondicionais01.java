
public class EstruturasCondicionais01 {
    //Estruturas Condicionais em Java IF e ELSE
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;
        if (isAutorizadoComprarBebidaAlcolica){
            System.out.println("Autorizado a comprar bebida Alcolica");
        }
        else {
            System.out.println("Nao Autorizado a comprar bebida Alcolica");
        }
        System.out.println("Fim do programa");
    }
}
/*Enviar mensagem sem o ELSE
---------- == false ----------
if (isAutorizadoComprarBebidaAlcolica == false){
    System.out.println("Não Autorizado a comprar bebida Alcolica");
}
------------- ! --------------
if (!isAutorizadoComprarBebidaAlcolica){
    System.out.println("Autorizado a comprar bebida Alcolica");
}

------------- Não usar comparação booleana --------------
boolean c = true;
if (c == false){
    System.out.println("Dentro do if");
} else {
    System.out.println("Dentro do else");
}

if (c != true){
    System.out.println("Dentro do if");
} else {
    System.out.println("Dentro do else");
}
*/