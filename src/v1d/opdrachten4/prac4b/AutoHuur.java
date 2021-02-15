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
        double totaalPrijs = 0;
        if(gA != null && k != null){
            double korting = 100 - k.getKorting();
            System.out.println(korting);
            totaalPrijs =  gA.getPrijsPerDag() * aantalDagen / korting;
        }
        return " autotype: " + gA + "\n"
                + " op de naam van: " + k + "\n"
                + " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs; //* gA.getPrijsPerDag();
    }
}
