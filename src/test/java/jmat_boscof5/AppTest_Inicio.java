package jmat_boscof5;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest_Inicio {

    @Test
    public void testFizzBuzz() {
        // Arrange
        Fizz_Buzz fizzBuzz = new Fizz_Buzz();
        List<String> expected = new ArrayList<>();

        // Generar la lista esperada
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                expected.add("FizzBuzz");
            } else if (i % 3 == 0) {
                expected.add("Fizz");
            } else if (i % 5 == 0) {
                expected.add("Buzz");
            } else {
                expected.add(Integer.toString(i));
            }
        }

        // Act
        List<String> result = fizzBuzz.fizz_buzz();

        // Assert
        assertEquals(expected, result);
    }
}
