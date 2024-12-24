package src.POexercises;

public class Company extends TaxPay {


    private int numberOfEmployees;

    public Company(String name, Double customAnual, int numberOfEmployees) {
        super(name, customAnual);
        this.numberOfEmployees = numberOfEmployees;
    }


    public Company() {}



    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }



    @Override
    public Double tax() {
        if (numberOfEmployees > 10) {
            return getCustomAnual() * 0.14;

        } else {
            return getCustomAnual() * 0.16;
        }
    }
}
