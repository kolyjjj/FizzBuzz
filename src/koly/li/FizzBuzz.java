package koly.li;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String run(int inputNumber) {
        StringBuilder result = new StringBuilder();
        List<Divisible> divisibleObjects = initilizeDivisibleObjects();
        appendStrings(inputNumber, result, divisibleObjects);
        return result.toString();
    }

    private void appendStrings(int inputNumber, StringBuilder result, List<Divisible> divisibleObjects) {
        for (Divisible d : divisibleObjects){
            if (d.by(inputNumber)){
                result.append(d.getSpecifiedString());
            }
        }
    }

    private List<Divisible> initilizeDivisibleObjects() {
        List<Divisible> divisibleObjects = new ArrayList<Divisible>();
        divisibleObjects.add(new DivisibleByThree());
        divisibleObjects.add(new DivisibleByFive());
        divisibleObjects.add(new DivisibleByTwo());
        return divisibleObjects;
    }

}
