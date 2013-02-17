package koly.li;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<Divisible> divisibleObjects = new ArrayList<Divisible>();

    public FizzBuzz() {
        initilizeDivisibleObjects();
    }

    public String run(int inputNumber) {
        return appendStrings(inputNumber, new StringBuilder());
    }

    private String appendStrings(int inputNumber, StringBuilder result) {
        for (Divisible d : divisibleObjects){
            if (d.by(inputNumber)){
                result.append(d.getSpecifiedString());
            }
        }
        return result.toString();
    }

    private void initilizeDivisibleObjects() {
        divisibleObjects.add(new DivisibleByThree());
        divisibleObjects.add(new DivisibleByFive());
        divisibleObjects.add(new DivisibleByTwo());
    }

}
