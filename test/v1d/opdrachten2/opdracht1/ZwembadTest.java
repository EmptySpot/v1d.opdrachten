package v1d.opdrachten2.opdracht1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    void getBreedte() {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        assertEquals(2.0, z1.getBreedte());
    }

    @Test
    void setBreedte() {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        z1.setBreedte(-5.0);
        assertEquals(-5.0, z1.getBreedte());
    }

    @Test
    void getLengte() {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        assertEquals(5.5, z1.getLengte());
    }

    @Test
    void setLengte() {
    }

    @Test
    void getDiepte() {
    }

    @Test
    void setDiepte() {
    }

    @Test
    void inhoud() {
    }

    @Test
    void testToString() {
    }
}