package koly.li;

public class FizzBuzz {
    public String run(int inputNumber) {
    if (isDivisibleByThree(inputNumber) && isDivisibleByFive(inputNumber)){
        return "FizzBuzz";
    }
    if (isDivisibleByThree(inputNumber)){
        return "Fizz";
    }
    if (isDivisibleByFive(inputNumber)){
        return "Buzz";
    }
    return null;
    }

    private boolean isDivisibleByFive(int inputNumber) {
        return inputNumber % 5 == 0;
    }

    private boolean isDivisibleByThree(int inputNumber) {
        return inputNumber % 3 == 0;
    }
}
