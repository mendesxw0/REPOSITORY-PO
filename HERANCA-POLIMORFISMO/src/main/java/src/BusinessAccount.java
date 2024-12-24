package src;

public class BusinessAccount extends  Account{

        private  Double loanLimit;

        public BusinessAccount() {
            super();

         }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public double loan(double amount) {
            if (amount <= loanLimit) {
                System.out.println("AMOUNT: "+amount);
                return balance += amount - 10;
            }
             return  0;
        }


    @Override   // indica pro compilador que este método é sobrescrito.
    public void withdraw(double amount) {
            super.withdraw(amount);
               balance -= 2.0;
    }

    public String toString() {
        return "BusinessAccount {" +
                "  number="  +  getNumber() +
                ", holder='"  +  getHolder() + '\'' +
                ", balance="  +  getBalance() +
                "  loanLimit="  +  getLoanLimit() +
                '}';
    }


}
