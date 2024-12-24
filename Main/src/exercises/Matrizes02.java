package exercises;

import java.util.Scanner;

public class Matrizes02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int somaDeVetores = sc.nextInt();
        int[] arrayList = new int[somaDeVetores];

        int soma = 0;
        for (int i = 0; i < somaDeVetores; i++) {

            System.out.print("Digite "+somaDeVetores+" número(s): ");
            arrayList[i] = sc.nextInt();
        }
        for (int i = 0; i < somaDeVetores; i++) {
            soma += arrayList[i];
        }
        int media = soma / somaDeVetores;

        for (int i=0; i<somaDeVetores; i++) {
            System.out.println( arrayList[i]);
        }

        System.out.println("SOMA = "+ soma);
        System.out.println("MEDIA ="+ media);
       sc.close();

    }
}
