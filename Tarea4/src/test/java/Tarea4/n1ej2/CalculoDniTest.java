package Tarea4.n1ej2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculoDniTest {
    @ParameterizedTest
    @CsvSource({
            "48096130, W",
            "46237920, P",
            "87654321, B",
            "98765432, C",
            "23456789, D",
            "54321678, E",
            "65432187, F",
            "45678923, A",
            "41758262, Z",
            "25879641, H"
    })
    public void comprobarCalculoDni(int num, char letra) {
        assertEquals(letra, CalculoDni.calcularLetraDni(num));
    }
}