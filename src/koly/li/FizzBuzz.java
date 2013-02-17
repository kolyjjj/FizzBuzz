package koly.li;

public class FizzBuzz {
    public String run(int inputNumber) {
        StringBuilder result = new StringBuilder();
        if (new DivisibleByThree().by(inputNumber)) {
            result.append("Fizz");
        }
        if (new DivisibleByFive().by(inputNumber)) {
            result.append("Buzz");
        }
        if (new DivisibleByTwo().by(inputNumber)){
            result.append("Hizz");
        }
        return result.toString();
    }

}
