// Operadores aritiméticos
public class Operadores {
// + - * / %
// Tomando cuidade com a contatenação de Strings
    public static void main(String[] args){
        int numb1 = 10;
        int numb2 = 20;
        int result = numb1 + numb2;
        float result2 = numb2 / 3f;
        boolean isAdult = true;
        System.out.println(result + " " + result2 + " " + isAdult);


        //%
        int rest = 20% 2;
        System.out.println(rest);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualAVinte);
        System.out.println(isDezIgualADez);
        System.out.println(isDezDiferenteDeVinte);
        System.out.println("-------------------");

        //Comparadores lógicos
        // && (AND) || (OR) ! (NOT)

        int idade = 29;
        float salario = 4000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("MaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("MenorQueTrinta"+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCompravel"+isPlayStationCompravel);


        // = += -= *= /= %=
        double bonus = 1800;
        //bonus = 1800 + 1000;
        bonus += 1000;// bonus = bonus + 1000
        bonus -= 1000;// bonus = bonus - 1000
        bonus *= 2;// bonus = bonus * 2
        bonus /= 2;// bonus = bonus / 2
        bonus %= 2;// bonus = bonus % 2
        System.out.println(bonus);

        //
        int contador = 0;
        contador++;//contador += 1;
        contador--;//contador -= 1;
        ++contador;//contador += 1;
        --contador;//contador -= 1;
        System.out.println(contador);
    }
}