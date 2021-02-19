package v1d.opdrachten4.prac4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        if(prijsPerDag < 0){
            prijsPerDag *= -1;
        }
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return type + " met de prijs per dag: " + prijsPerDag;
    }
}
