package OOP.ExercisePO;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Qual o preço do Dollar?");
        double priceDolar = sc.nextDouble();
        System.out.println("Quantos dólares serão comprados?");
        double valueDolarUser = sc.nextDouble();

       double result = PriceDollar.calcularPriceDollar(priceDolar, valueDolarUser);
        System.out.println("O valor a ser pago em reais é de: "+ result);
    }
}
