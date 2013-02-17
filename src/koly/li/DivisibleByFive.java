package koly.li;

public class DivisibleByFive implements Divisible{

    @Override
    public boolean by(int inputNumber) {
        return inputNumber % 5 == 0;
    }

    public String getSpecifiedString() {
        return "Buzz";
    }
}
