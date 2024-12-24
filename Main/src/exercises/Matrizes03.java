package exercises;

import java.util.Scanner;

public class Matrizes03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai querer? ");
        int pegarNumero = sc.nextInt();
        int result;
        int[] arrayList = new int[pegarNumero];

        for (int i = 0; i < pegarNumero; i++) {
            System.out.print("Digite um número: ");
            arrayList[i] = sc.nextInt();
        }

        // 6
        // 8, 2, 11, 14, 13, 20
        result = 0;
        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < pegarNumero; i++) {
            if (arrayList[i] % 2 == 0 ) {
                System.out.println(arrayList[i]);
                result ++;
            }
        }

    System.out.println("QUANTIDADES DE PARES: "+ result);
        sc.close();
    }
}
