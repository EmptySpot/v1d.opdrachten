package v1d.opdrachten2.opdracht1;

public class Klant {
    private String naam;
    private String plaats;
    private String adres;

    public Klant(String naam, String plaats, String adres){
        this.naam = naam;
        this.plaats = plaats;
        this.adres = adres;

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
