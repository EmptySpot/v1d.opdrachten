package v1d.test;

public class test1 {
    private static int a = 12;

    // HIER ZITTEN ATTRIBUTEN

    public static void main(String[] arg) {

        // HIER ZITTEN VARIABELEN

        String naam = "Jan";
        String adres = "Nijenoord 1";
        String plaats = "Utrecht";

        System.out.println(naam + "\n" + adres + "\n" + plaats);

        naam = "Bob";
        adres = "Brrr 2";
        plaats = "Amersfoort";

        System.out.println(naam + "\n" + adres + "\n" + plaats + a);
    }
}
