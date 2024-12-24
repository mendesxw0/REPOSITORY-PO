package OOP.ExercisePO;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int imposto = sc.nextInt();
        double salario = sc.nextDouble();

        double taxa = sc.nextDouble();


        Main newFuncionario = new Main(name, imposto, salario, taxa);

        System.out.println(newFuncionario.getNameFuncionario());
        System.out.println(newFuncionario.getSalarioBruto());
        System.out.println(newFuncionario.getTaxaSalario());


        System.out.println(newFuncionario);


        System.out.println();
        System.out.println("Qual a porcentagem de desconto?");
//        double porcentageFinal = sc.nextInt();

        System.out.println(newFuncionario.calcularImposto(taxa));

        sc.close();

    }
}
