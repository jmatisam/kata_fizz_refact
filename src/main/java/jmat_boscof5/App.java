package jmat_boscof5;

import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FizzBuzzRefactorizado fizzBuzz = new FizzBuzzRefactorizado();
        List<String> result = fizzBuzz.fizzbuzzrefact();
        System.out.println("Resultado de Fizz_Buzz_Refactorizado:");
        for (String item : result) {
            System.out.println(item);
        }
    }
}
