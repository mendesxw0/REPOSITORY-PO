package src.AULAS;

import src.ENUMS.Client;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OrderMain orderMain = new OrderMain(1,  Client.PENDING_PAYMENT, new Date());

        Client CLT = Client.DELIVERED;
        Client oo1 = Client.valueOf("DELIVERED");





        System.out.println(CLT);
        System.out.println(oo1);

        System.out.println(orderMain);


    }
}
