package AULAS;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class FilaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fila[] newFilaTest = new Fila[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas deseja adicionar a fila? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("qual nome? ");
            String nameUserfila = sc.next();
            System.out.print("Qual a idade? ");
            int iadadePreferenia = sc.nextInt();
            System.out.print("Qual a quantidade de compras? ");
            int quantidadeDeCompras = sc.nextInt();

            newFilaTest[i] = new Fila(nameUserfila, iadadePreferenia, quantidadeDeCompras);
            System.out.println(newFilaTest[i].toString2());
        String result = Arrays.toString(newFilaTest[i].removerPrimeiro(newFilaTest));

            System.out.println(result);

        }



        sc.close();
    }
}
