package src.POexercises;

public class ImportedProduct extends Product{
    private Double customsFree;

    public ImportedProduct() {
    }

    public ImportedProduct(String nameProduct, Double priceProduct, Double customsFree) {
        super(nameProduct, priceProduct);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }


    @Override
    public String priceTeg() {
        String result = super.priceTeg()+ " (Customs fee: $ + " + customsFree +")";
        return result;
    }

    public Double totalPrice() {
        return getPriceProduct() + customsFree;
    }
}
