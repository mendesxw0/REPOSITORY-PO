package AULAS;

import java.util.Locale;
import java.util.Scanner;

public class ProductVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vetores02[] vect = new Vetores02[n];

        // vect.length é melhor usar, pois não fico dependendo de uma segunda variavel.
        // O vetor sabe o seu tamanho, então fica melhor o uso.
        for (int i = 0; i < vect.length; i++) {
            String name = sc.next();
            double price = sc.nextDouble();

            System.out.println(name);
            System.out.println(price);
            vect[i] = new Vetores02(price, name);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPriceProduct();

        }

        double result = soma / vect.length;

        System.out.printf("Media: %.2f%n", result);


        sc.close();
    }
}
