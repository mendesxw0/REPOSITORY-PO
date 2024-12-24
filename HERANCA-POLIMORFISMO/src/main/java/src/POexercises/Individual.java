package src.POexercises;

public class Individual extends TaxPay {

    private double healthexpenditures;

    public Individual(String name, Double customAnual, double healthexpenditures) {
        super(name, customAnual);
        this.healthexpenditures = healthexpenditures;
    }

    public Individual() {

    }

    public double getHealthexpenditures() {
        return healthexpenditures;
    }

    public void setHealthexpenditures(double healthexpenditures) {
        this.healthexpenditures = healthexpenditures;
    }

    @Override
    public Double tax() {
        if (getCustomAnual() < 20000.0) {
            return getCustomAnual() * 0.15 - healthexpenditures * 0.5;
        }
        else {
            return getCustomAnual() * 0.25 - healthexpenditures * 0.5;
        }
    }

}
