package Tarea4.n1ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {

    private CalculoDni calculoDni;

    @BeforeEach//consulta Romina
    public void setUp() {
        calculoDni = new CalculoDni();
    }

    @ParameterizedTest
    @CsvSource({
            "48096130, W",
            "46237920, P",
            "49527158, Q",
            "46005620, P",
            "72055121, P",
            "26453678, K",
            "55931801, X",
            "45678923, A",
            "19533254, K",
            "65117744, Y"
    })
    public void comprobarCalculoDni(int num, char letra) {
        assertEquals(letra, calculoDni.calcularLetraDni(num));
    }
}