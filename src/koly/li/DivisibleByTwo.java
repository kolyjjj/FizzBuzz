package koly.li;

public class DivisibleByTwo implements Divisible {
    @Override
    public boolean by(int inputNumber) {
        return inputNumber % 2 == 0;
    }
}
