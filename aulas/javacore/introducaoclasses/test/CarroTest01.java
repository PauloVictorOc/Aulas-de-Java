package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.nome= "Porshe";
        carro1.marca= "Porshe";
        carro1.modelo= "GT-540";
        carro1.cor= "Azul Bebe";
        carro1.ano= 2006;


        //carro1 = carro2; as informações do carro 1 são dispersadas e passam a ser a mesma que a segunda ou vice versa


        carro2.nome= "Impala";
        carro2.marca= "Chevrolet";
        carro2.modelo= "A-1967";
        carro2.cor= "Preta";
        carro2.ano= 1967;

        System.out.println("Carro1:" +"\n" + carro1.nome +"\n" + carro1.marca +"\n" + carro1.modelo +"\n" + carro1.cor +"\n" + carro1.ano);
        System.out.println("\n-----------------------");
        System.out.println("\nCarro2:" +"\n" + carro2.nome +"\n" + carro2.marca +"\n" + carro2.modelo +"\n" + carro2.cor +"\n" + carro2.ano);

    }
}
