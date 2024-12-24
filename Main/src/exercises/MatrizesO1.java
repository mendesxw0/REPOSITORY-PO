package exercises;

import java.util.Scanner;

public class MatrizesO1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("infome um valor inteiro");
        int pegarNumero = sc.nextInt();

        int[] arrayList = new int[pegarNumero];

        for (int i = 0; i < pegarNumero; i++) {

            System.out.printf("Digite um número: ");
            arrayList[i] = sc.nextInt();
        }

        for (int i = 0; i < pegarNumero; i++) {
            if (arrayList[i]< 0) {
                System.out.println("Números negativos: " + arrayList[i]);
            }
        }
    }
}
