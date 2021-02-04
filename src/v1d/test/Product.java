package v1d.test;

public class Product {
    private String productNaam;
    private String productCode;
    private double productPrijs;
    private double btw;

    public Product(String productNaam, String productCode, double productPrijs) {
        this.productNaam = productNaam;
        this.productCode = productCode;
        this.productPrijs = productPrijs;
    }

    public Product(String productNaam, String productCode) {
        this.productNaam = productNaam;
        this.productCode = productCode;
    }

    public double getPrijs() {
        return productPrijs;
    }

    public void setPrijs(double productPrijs) {
        this.productPrijs = productPrijs;
    }

    public void verhoogPrijsMet(double verhoger) {
        this.productPrijs = productPrijs * ((100 + verhoger)/100);
    }

    public double getBtw() {
        return btw;
    }

    public void setBtw(double btw) {
        this.btw = btw;
    }

    public double btwBedrag() {
        return productPrijs * (btw/100);
    }

    @Override
    public String toString() {
        return productNaam + " heeft code " + productCode + " en kost " + productPrijs + "; de btw is " + btw +"%";

    }
}
