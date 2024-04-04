package Tarea4.n1ej1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class TestMeses {

    @Test
    public void testListaTiene12Posiciones() {
        Meses meses = new Meses();
        assertEquals(12, meses.getMesesAnyo().size());
    }
    @Test
    public void testListaNoEsNula() {
        Meses meses = new Meses();
        assertNotNull(meses.getMesesAnyo());
    }
    @Test
    public void testPosicion8ContieneAgosto() {
        Meses meses = new Meses();
        assertEquals("Agosto", meses.getMesesAnyo().get(7));
    }




    }


