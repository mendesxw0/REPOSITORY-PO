package src;

public final class SavingsAccount extends  Account{

    private Double interestRate;
    public SavingsAccount() {

    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override   // indica pro compilador que este método é sobrescrito.
    public void withdraw(double amount) {
        balance -= amount;
    }
}
