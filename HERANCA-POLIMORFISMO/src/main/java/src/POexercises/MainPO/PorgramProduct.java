package src.POexercises.MainPO;
import src.POexercises.ImportedProduct;
import src.POexercises.Product;
import src.POexercises.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PorgramProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> listProduct = new ArrayList<>();


        System.out.println("Entre com a quantidade de produtos: ");
        Integer valueProduct = sc.nextInt();


        for (int i = 1; i <= valueProduct; i++) {
            System.out.print("O produto é Comum, usado ou importado (c/u/i)? ");
            char character = sc.next().charAt(0);

            System.out.print("Name: ");
            String nameProduct = sc.next();
            System.out.print("Price: ");
            Double priceProduct = sc.nextDouble();

            // verificar se o produto é importado.
            if (character == 'i') {

                System.out.print("Customs free: ");
                Double customsFree  = sc.nextDouble();
                listProduct.add(new ImportedProduct(nameProduct, priceProduct, customsFree));

            } else if (character == 'c') {

                listProduct.add(new Product(nameProduct, priceProduct));

            } else {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                listProduct.add(new UsedProduct(nameProduct, priceProduct, date));
            }


            System.out.println();
            System.out.println("ETIQUETAS DE PRECO:");
            for (Product prod : listProduct) {
                System.out.println(prod.priceTeg());
            }

        }



        sc.close();
    }
}
