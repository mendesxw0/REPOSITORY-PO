package src.POexercises;
import  java.util.Date;
import java.time.LocalDate;
public class UsedProduct extends Product{
    private LocalDate manufactureDate;
    public UsedProduct() {
    }

    public UsedProduct(String nameProduct, Double priceProduct, LocalDate manufactureDate) {
        super(nameProduct, priceProduct);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTeg() {
        String result = getNameProduct() + "(used) $ " + getPriceProduct() + "(manufacture Date: ( "+ manufactureDate +" )";
        return result;
    }
}
