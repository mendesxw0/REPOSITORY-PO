package src.exercise;

import src.ENUMS.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramMain {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Digite os dados do usuario: ");
        System.out.println("Nome: ");
        String nameUser = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Data de nascimento (DD/MM/YYYY): ");
        Date dataUser = sdf.parse(sc.next());


        Client newClient = new Client(nameUser, dataUser, email);

        System.out.println("Insira os dados do pedido: ");
        System.out.println("Status: ");
        OrderStatus level = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), level, newClient);



        System.out.println("Quantos itens a nesse pedido?");
        int n = sc.nextInt();



        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com o item #"+i+" :" );
            System.out.println("Product name: ");
            String nameproduct = sc.next();

            System.out.println("Product price: ");
            Double price = sc.nextDouble();

            Product product = new Product(nameproduct, price);
            System.out.println("Quantidades: ");
            int quantityPedidios = sc.nextInt();
            OrderItens orderItens = new OrderItens(quantityPedidios, price, product);

            order.addItem(orderItens);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
}
}
