package src.POexercises.MainPO;


import src.POexercises.Company;
import src.POexercises.Individual;
import src.POexercises.TaxPay;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TaxPay> list = new ArrayList<>();


        System.out.print("Digite a quantidade de funcionarios: ");
        int resultEmployee = sc.nextInt();


        for (int i = 1; i <= resultEmployee; i++) {
            System.out.println("Dados do pagamento #"+i+": ");
            System.out.print("Pessoa fisica ou juridica? (i/c) " );
            char caracter = sc.next().charAt(0);


            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Renda Anual: ");
            double rendaAnual = sc.nextDouble();

            if (caracter == 'i') {
                System.out.print("Despesas com saúde: ");
                double healthExpenditures = sc.nextDouble();
                list.add( new Individual(name, rendaAnual, healthExpenditures));
            } else {

                System.out.print("Número de Funcinarios:  ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, rendaAnual, numberOfEmployees));
            }
        }


        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPay tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
