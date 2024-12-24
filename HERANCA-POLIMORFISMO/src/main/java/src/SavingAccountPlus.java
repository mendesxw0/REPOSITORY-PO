package src;

public class SavingAccountPlus extends  BusinessAccount{


    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }


    /*
    O metodo withdraw, não pode ser sobreposto na extensão da classe SavingsAccount.
    Caso eu queira extender ele novamente, tenho que utilizar
    a classe Account ou a classe BusinessAccount.

    */
}
