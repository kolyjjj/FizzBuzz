package koly.li;

public class FizzBuzz {

    private int inputNumber;

    public String run(int inputNumber) {
        this.inputNumber = inputNumber;
        StringBuilder result = new StringBuilder();
        if (isDivisibleByThree()) {
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

    private boolean isDivisibleByThree() {
        return inputNumber % 3 == 0;
    }
}
