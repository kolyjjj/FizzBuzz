package koly.li;

public class FizzBuzz {
    public String run(int inputNumber) {
        StringBuilder result = new StringBuilder();
//        if (isDivisibleByThree(inputNumber) && isDivisibleByFive(inputNumber)) {
//            return "FizzBuzz";
//        }
        if (isDivisibleByThree(inputNumber)) {
            //return "Fizz";
            result.append("Fizz");
        }
        if (isDivisibleByFive(inputNumber)) {
//            return "Buzz";
            result.append("Buzz");
        }
//        return null;
        return result.toString();
    }

    private boolean isDivisibleByFive(int inputNumber) {
        return inputNumber % 5 == 0;
    }

    private boolean isDivisibleByThree(int inputNumber) {
        return inputNumber % 3 == 0;
    }
}
