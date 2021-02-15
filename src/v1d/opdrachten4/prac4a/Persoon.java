package v1d.opdrachten4.prac4a;

public class Persoon {
    private String persoonNaam;
    private int persoonLeeftijd;

    public Persoon(String persoonNaam, int persoonLeeftijd) {
        this.persoonNaam = persoonNaam;
        this.persoonLeeftijd = persoonLeeftijd;
    }

    @Override
    public String toString() {
        return persoonNaam  + "; leeftijd " + persoonLeeftijd + " jaar";
    }
}