package v1d.opdrachten6.opdracht6a;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwPrijs;

    public Game(String naam, int releaseJaar, double nieuwPrijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwPrijs = nieuwPrijs;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int huidigJaar = LocalDate.now().getYear();
        double huidigeWaarde = nieuwPrijs;
        while(huidigJaar>releaseJaar){
            huidigeWaarde *= 0.7;
            huidigJaar -= 1;
        }
        return huidigeWaarde;
    }

    @Override
    public boolean equals(Object andereObject) {
        try {
            Game comparing = (Game) andereObject;
            return (this.naam.equals(comparing.naam) && this.releaseJaar == comparing.releaseJaar);
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("##.00");
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + f.format(nieuwPrijs) + " nu voor: €" + f.format(huidigeWaarde());
    }
}
