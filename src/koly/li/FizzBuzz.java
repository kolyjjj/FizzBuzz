package koly.li;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String run(int inputNumber) {
        StringBuilder result = new StringBuilder();
        List<Divisible> divisibleObjects = new ArrayList<Divisible>();
        divisibleObjects.add(new DivisibleByThree());
        divisibleObjects.add(new DivisibleByFive());
        divisibleObjects.add(new DivisibleByTwo());

        for (Divisible d : divisibleObjects){
            if (d.by(inputNumber)){
                result.append(d.getSpecifiedString());
            }

        }
//        if (new DivisibleByThree().by(inputNumber)) {
//            result.append(new DivisibleByThree().getSpecifiedString());
//        }
//        if (new DivisibleByFive().by(inputNumber)) {
//            result.append(new DivisibleByFive().getSpecifiedString());
//        }
//        if (new DivisibleByTwo().by(inputNumber)){
//            result.append(new DivisibleByTwo().getSpecifiedString());
//        }
        return result.toString();
    }

}
