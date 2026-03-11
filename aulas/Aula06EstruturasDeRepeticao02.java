public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args){
        //Imprima todos os números pares até 100000
        for(int i=0; i < 100000; i+=2){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
