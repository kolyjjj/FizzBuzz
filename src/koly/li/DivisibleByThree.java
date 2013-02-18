package koly.li;

public class DivisibleByThree implements Divisible{

    @Override
    public boolean by(int inputNumber) {
        return inputNumber % 3 == 0;
    }

    public String getSpecifiedString() {
        return "Fizz";
    }
}
