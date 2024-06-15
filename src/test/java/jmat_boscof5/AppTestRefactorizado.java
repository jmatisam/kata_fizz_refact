package jmat_boscof5;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTestRefactorizado {

    @Test
    public void testFizzBuzz() {
        // Arrange
        FizzBuzzRefactorizado fizzBuzz = new FizzBuzzRefactorizado();
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
        List<String> result = fizzBuzz.fizzbuzzrefact();

        System.out.println("Expected:");
        System.out.println(expected);
        System.out.println("Result:");
        System.out.println(result);

        // Assert
        assertEquals(expected, result);
    }
}
