package v1d.opdrachten4.prac4b;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kortingsPercentage) {
        while (kortingsPercentage >= 100){
            kortingsPercentage -= 100;
        }
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
