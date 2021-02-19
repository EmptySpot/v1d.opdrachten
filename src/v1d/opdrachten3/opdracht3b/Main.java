package v1d.opdrachten3.opdracht3b;

//        -- Voor testen
//        Als je de try-catch blok weghaalt dan zal de applicatie tijdens uitvoeren stoppen.
//        Want dan zit er een error in de code waardoor de code een fout oploopt en crasht.
//        De code doet alles tot de error. Op dat punt stopt hij dus hij compileert, hij kan uitgevoerd worden
//        Maar hij word gestopt tijdens die uitvoer.
//
//
//        -- Na testen
//        Exception in thread "main" java.lang.IllegalArgumentException: Radius moet groter dan 0 zijn!
//        at v1d.opdrachten3.opdracht3b.Cirkel.<init>(Cirkel.java:10)
//        at v1d.opdrachten3.opdracht3b.Main.main(Main.java:9)
//
//        Dus mijn hypothese was correct. Doordat er een throw in cirkel zit, word er een error gegeven.
//        Echter zonder try catch zijn er geen maatregelen genomen tegen errors dus crasht de code op een error.
//        Er kon alleen java bestanden worden geupload, dit staat ook in de opmerking.

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}






