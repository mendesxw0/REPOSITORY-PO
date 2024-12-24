package exercises;

import java.util.Locale;
import java.util.Scanner;

public class HostingTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Hosting[] hostingsNew = new Hosting[10];

        System.out.println("Quantos pessoas? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("Name: ");
            String nameUser =  sc.next();
            System.out.println("Email: ");
            String emailUser = sc.next();
            System.out.println("Número do quarto: ");
            int numeroAluguel = sc.nextInt();

            hostingsNew[numeroAluguel] = new Hosting(nameUser, emailUser );

        }
        for (int i=0; i<10; i++) {
            if (hostingsNew[i] != null) {
                System.out.println(i + ": " + hostingsNew[i]);
            }
        }
    }
}
