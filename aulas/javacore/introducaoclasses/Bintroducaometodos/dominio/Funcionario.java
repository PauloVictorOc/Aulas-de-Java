//teste
package javacore.introducaoclasses.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int cpf;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
        }
        imprimeMediaSlario();
    }

    public void imprimeMediaSlario() {
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
            System.out.println("\nMedia Salarial: " + media);
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salarios;
    }

    public void setSalarios(double[] salario) {
        this.salarios = salario;
    }

    public double getMedia() {
        return media;
    }

}

