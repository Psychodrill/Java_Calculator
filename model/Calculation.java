package model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculation {

    Map<Character, BinaryOperator<Integer>> operations = new HashMap<Character, BinaryOperator<Integer>>();

    private void fillMap(Map<Character, BinaryOperator<Integer>>operations){
        operations.put('*', (x,y)->x*y);
        operations.put('+', (x,y)->x+y);
        operations.put('-', (x,y)->x-y);
        operations.put('/', (x,y)->x/y);
    }
    public  int calculate(char op, int a, int b) {
        fillMap(operations);
        return operations.get(op).apply(a, b);
    }
    
}
