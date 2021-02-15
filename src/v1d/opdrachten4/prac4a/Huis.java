package v1d.opdrachten4.prac4a;



public class Huis {
    private String adres;
    private int bouwJaar;
    private Persoon persoon = null;
    private Persoon persoonLeeftijd = null;

    public Huis(String adres, int bouwJaar) {
        this.adres = adres;
        this.bouwJaar = bouwJaar;
    }

    public void setHuisbaas(Persoon persoon){
        this.persoon = persoon;
    }

    public Persoon getHuisbaas(){
        return persoon;
    }

    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwJaar + "\nen heeft huisbaas " + persoon;
    }
}
