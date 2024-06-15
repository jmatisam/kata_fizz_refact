package jmat_boscof5;

import java.util.ArrayList;
import java.util.List;


public class Fizz_Buzz{

    public List<String> fizz_buzz() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}