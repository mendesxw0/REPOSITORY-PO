package src.Program;

import src.Account;
import src.BusinessAccount;
import src.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(102 , "Lucas" , 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        /*
             No exemplo abaixo, a sobreposição está funcionando normalmente.
         */

        Account acc2 = new SavingsAccount(102, "Gabriel", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(201, "Lucas Gabriel", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
