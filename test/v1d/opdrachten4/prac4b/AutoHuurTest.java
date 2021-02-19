package v1d.opdrachten4.prac4b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {

    @Test
    void geenPersoonGeenAuto() {
        AutoHuur ahT = new AutoHuur();
        assertEquals(" autotype: er is geen auto bekend\n" +
                " op de naam van: er is geen huurder bekend\n" +
                " aantal dagen: 0 en dat kost 0.0", ahT.toString());
    }

    @Test
    void geenPersoonWelAuto() {
        AutoHuur ahT = new AutoHuur();
        Auto aT = new Auto("Renault", 100);
        ahT.setGehuurdeAuto(aT);
        assertEquals(" autotype: Renault met de prijs per dag: 100.0\n op de naam van: er is geen huurder bekend\n aantal dagen: 0 en dat kost 0.0", ahT.toString());
    }

    @Test
    void welPersoonGeenAuto() {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        ahT.setHuurder(k);
        assertEquals(" autotype: er is geen auto bekend\n" +
                " op de naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                " aantal dagen: 0 en dat kost 0.0", ahT.toString());
    }

    @Test
    void GeenDagenWelReturn() {
        AutoHuur ahT = new AutoHuur();
        assertEquals(0, ahT.getAantalDagen());
    }

    @Test
    void HogeDagen() {
        AutoHuur ahT = new AutoHuur();
        ahT.setAantalDagen(2000000);
        assertEquals(2000000, ahT.getAantalDagen());
    }

    // Negatieve dagen moet positief worden gedraaid, je kan niet negatief huren.
    @Test
    void NegatieveDagen() {
        AutoHuur ahT = new AutoHuur();
        ahT.setAantalDagen(-10);
        assertEquals(10, ahT.getAantalDagen());
    }

    @Test
    void GeenDagen() {
        AutoHuur ahT = new AutoHuur();
        assertEquals(0, ahT.getAantalDagen());
    }

    @Test
    void GeenBedrag() {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", 0);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 0.0\n" +
                " op de naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                " aantal dagen: 4 en dat kost 0.0", ahT.toString());
    }

    //Ik wil niet dat je een auto kan huren en geld terug kan krijgen, dus bij negatief bedrag moet hij positief zijn.
    @Test
    void NegatiefBedrag() {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", -50);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.0\n" +
                " op de naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                " aantal dagen: 4 en dat kost 200.0", ahT.toString());
    }

    //Echter bij negatieve korting wil ik dat de prijs hoger word.
    @Test
    void NegatiefKortingPositiefBedrag() {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(-10.0);
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", -50);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.0\n" +
                " op de naam van: Mijnheer de Vries (korting: -10.0%)\n" +
                " aantal dagen: 4 en dat kost 220.0", ahT.toString());
    }

    @Test
    void NegatiefKortingNegatiefBedrag() {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(-10.0);
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", -50);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.0\n" +
                " op de naam van: Mijnheer de Vries (korting: -10.0%)\n" +
                " aantal dagen: 4 en dat kost 220.0", ahT.toString());
    }

    @Test
    void TeVeelCommaGeldWeinigDagen () {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");

        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", 50.539632);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.539632\n" +
                " op de naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                " aantal dagen: 4 en dat kost 202.16", ahT.toString());
    }

    @Test
    void TeVeelCommaGeldVeelDagen () {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");

        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", 50.539632);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(1257);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.539632\n" +
                " op de naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                " aantal dagen: 1257 en dat kost 63528.32", ahT.toString());
    }

    @Test
    void TeVeelCommaKortingWeinigDagen () {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.59325);
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", 50);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.0\n" +
                " op de naam van: Mijnheer de Vries (korting: 10.59325%)\n" +
                " aantal dagen: 4 en dat kost 178.81", ahT.toString());
    }

    @Test
    void TeVeelCommaKortingVeelDagen () {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.59325);
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", 50);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(1257);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.0\n" +
                " op de naam van: Mijnheer de Vries (korting: 10.59325%)\n" +
                " aantal dagen: 1257 en dat kost 56192.14", ahT.toString());
    }

    @Test
    void TeVeelKorting100 () {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(100);
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", 50);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.0\n" +
                " op de naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                " aantal dagen: 4 en dat kost 200.0", ahT.toString());
    }

    @Test
    void TeVeelKortingRuim () {
        AutoHuur ahT = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(350);
        ahT.setHuurder(k);

        Auto a1 = new Auto("Peugeot 207", 50);
        ahT.setGehuurdeAuto(a1);
        ahT.setAantalDagen(4);
        assertEquals(" autotype: Peugeot 207 met de prijs per dag: 50.0\n" +
                " op de naam van: Mijnheer de Vries (korting: 50.0%)\n" +
                " aantal dagen: 4 en dat kost 100.0", ahT.toString());
    }
}