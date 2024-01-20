package model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

import logger.Log;

public class Calculation {
    private static final Logger log = Log.log(Calculation.class.getName());
    Map<Character, BinaryOperator<Integer>> operations = new HashMap<Character, BinaryOperator<Integer>>();

    private void fillMap(Map<Character, BinaryOperator<Integer>>operations){
        operations.put('*', (x,y)->x*y);
        operations.put('+', (x,y)->x+y);
        operations.put('-', (x,y)->x-y);
        operations.put('/', (x,y)->x/y);
    }
    public  int calculate(char op, int a, int b) {
        log.log(Level.INFO, "Method calculate in model package started");
        fillMap(operations);
        return operations.get(op).apply(a, b);
    }
    
}
