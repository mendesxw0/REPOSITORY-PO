package OOP.ExercisePO;

/*
Exercicio 1.
Criar uma classe, funcionario, que receberá o nome, salario bruto e imposto como argumento.
O objetivo é retornar o nome do funcionario com o salario e depois fazer a operação do imposto,
que será discontado do valor total do salario e atualizado ao final do programa.

OBS: o desconto afetará apenas o salario bruto.
 */

public class Main {
    private String nameFuncionario;
    private int impostoFuncionario;
    private double salarioBruto;
    private double taxaSalario;

    Main(String name, int imposto, double salario, double taxa) {
        nameFuncionario = name;
        impostoFuncionario = imposto;
        salarioBruto = salario;
        taxaSalario = taxa;

    }

    public double getTaxaSalario() {
        return taxaSalario;
    }


    public String getNameFuncionario() {
        return nameFuncionario;
    }



    public double getSalarioBruto() {
        return salarioBruto;
    }

    public int getImpostoFuncionario() {
        return impostoFuncionario;
    }


    public String toString() {
        String result = "O funcionario " + getNameFuncionario() + " recebe um salario de " + calcularTaxaSalario();
        return result;
    }

    public double calcularTaxaSalario() {
        double result = salarioBruto - taxaSalario;

        return  result;
    }

    public double calcularImposto(double porcentagem) {
         double resultImposto = (getSalarioBruto() * impostoFuncionario)/100;

        return resultImposto;
    }



}
