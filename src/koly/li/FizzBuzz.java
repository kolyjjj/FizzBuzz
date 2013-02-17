package koly.li;

public class FizzBuzz {
    public String run(int inputNumber) {
        StringBuilder result = new StringBuilder();
        if (isDivisibleByThree(inputNumber)) {
            result.append("Fizz");
        }
        if (isDivisibleByFive(inputNumber)) {
            result.append("Buzz");
        }
        if (isDivisibleByTwo(inputNumber)){
            result.append("Hizz");
        }
        return result.toString();
    }

    private boolean isDivisibleByTwo(int inputNumber) {
        return inputNumber % 2 == 0;
    }

    private boolean isDivisibleByFive(int inputNumber) {
        return inputNumber % 5 == 0;
    }

    private boolean isDivisibleByThree(int inputNumber) {
        return inputNumber % 3 == 0;
    }
}
