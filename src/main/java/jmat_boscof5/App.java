package jmat_boscof5;

import java.util.List;

public class App {
    public static void main(String[] args) {
    
        Fizz_Buzz fizzBuzzInicio = new Fizz_Buzz();
        List<String> result = fizzBuzzInicio.fizz_buzz();
        System.out.println("Resultado de Fizz_Buzz_Inicio:");
        for (String item : result) {
            System.out.println(item);
        }
    }
    
}
