package v1d.opdrachten4.prac4b;

public class AutoHuur {

    private int aantalDagen;
    private Auto gA = null;
    private Klant k = null;

    public AutoHuur() {
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public Auto getGehuurdeAuto() {
        return gA;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gA = gA;
    }

    public Klant getHuurder() {
        return k;
    }

    public void setHuurder(Klant k) {
        this.k = k;
    }

    @Override
    public String toString() {

        double totaalPrijs = 0.0;
        String autoType = "er is geen auto bekend";
        String klantInfo = "er is geen huurder bekend";

        if (gA != null){
            totaalPrijs = gA.getPrijsPerDag() * aantalDagen;
            autoType = gA.toString();
        }

        if (k != null){
            totaalPrijs *= (100 - k.getKorting())/100;
            klantInfo = k.toString();
        }

        return " autotype: " + autoType + "\n"
                + " op de naam van: " + klantInfo + "\n"
                + " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs;
    }
}
