package javacore.introducaoclasses.Bintroducaometodos.test;
//teste
import javacore.introducaoclasses.Bintroducaometodos.dominio.Estudante;
import javacore.introducaoclasses.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Vergil";
        estudante01.idade = 27;
        estudante01.sexo = 'H';

        estudante02.nome = "Nicolete";
        estudante02.idade = 20;
        estudante02.sexo = 'M';

        impressora.impressora(estudante01);

        impressora.impressora(estudante02);
    }
}
