package jmat_boscof5;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRefactorizado {

    public List<String> fizzbuzzrefact() {
        List<String> output = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else {
                output.add(Integer.toString(i));
            }
        }
        return output;
    }
}
