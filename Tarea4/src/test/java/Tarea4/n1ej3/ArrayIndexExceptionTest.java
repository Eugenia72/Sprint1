package Tarea4.n1ej3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
public class ArrayIndexExceptionTest {


    @Test
    public void testThrowArrayIndexOutOfBoundsException() {
        ArrayIndexException arrayIndexException = new ArrayIndexException();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            arrayIndexException.throwArrayIndexOutOfBoundsException();
        });
    }

}