package src.POexercises;

public abstract class TaxPay {

    private String name;
    private Double customAnual;


    public TaxPay(String name, Double customAnual) {
        this.name = name;
        this.customAnual = customAnual;
    }

    public TaxPay() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCustomAnual() {
        return customAnual;
    }

    public void setCustomAnual(Double customAnual) {
        this.customAnual = customAnual;
    }

    public abstract Double tax();
}
