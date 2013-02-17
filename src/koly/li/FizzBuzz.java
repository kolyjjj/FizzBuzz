package koly.li;

public class FizzBuzz {

    private int inputNumber;

    public String run(int inputNumber) {
        this.inputNumber = inputNumber;
        StringBuilder result = new StringBuilder();
        if (isDivisibleByThree()) {
            result.append("Fizz");
        }
        if (isDivisibleByFive()) {
            result.append("Buzz");
        }
        if (DivisibleByTwo.isDivisibleByTwo(inputNumber)){
            result.append("Hizz");
        }
        return result.toString();
    }

    private boolean isDivisibleByFive() {
        return inputNumber % 5 == 0;
    }

    private boolean isDivisibleByThree() {
        return inputNumber % 3 == 0;
    }
}
