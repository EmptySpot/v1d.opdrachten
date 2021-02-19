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
        if(aantalDagen < 0){
            aantalDagen *= -1;
        }
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

    public double totaalPrijs(){
        double totaalPrijs = gA.getPrijsPerDag() * aantalDagen;
        if (k!= null){
            totaalPrijs *= (100 - k.getKorting())/100;
            totaalPrijs = (double)Math.round(totaalPrijs*100);
            totaalPrijs = totaalPrijs / 100;
        }
        return totaalPrijs;
    }

    @Override
    public String toString() {

        double totaalPrijs = 0.0;
        String autoType = "er is geen auto bekend";
        String klantInfo = "er is geen huurder bekend";

        if (gA != null){
            totaalPrijs = totaalPrijs();
            autoType = gA.toString();
        }

        if (k != null){
            klantInfo = k.toString();
        }

        return " autotype: " + autoType + "\n"
                + " op de naam van: " + klantInfo + "\n"
                + " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs;
    }
}
