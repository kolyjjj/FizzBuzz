package koly.li;

public class FizzBuzz {
    public String run(int inputNumber) {
        StringBuilder result = new StringBuilder();
        if (DivisibleByThree.isDivisibleByThree(inputNumber)) {
            result.append("Fizz");
        }
        if (DivisibleByFive.isDivisibleByFive(inputNumber)) {
            result.append("Buzz");
        }
        if (DivisibleByTwo.isDivisibleByTwo(inputNumber)){
            result.append("Hizz");
        }
        return result.toString();
    }

}
