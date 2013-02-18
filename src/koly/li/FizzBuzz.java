package koly.li;

public class FizzBuzz {
    public boolean shuruhefa(int x){
    if (x < 0)
         return false;
    return true;
    }
    public String yunxing(int x) {
        //return FizzBuzz
    if (x % 3 == 0 && x % 5 == 0 ){
        return "FizzBuzz";}
    //return Fizz
    if (x % 3 == 0){
        return "Fizz";}
    //return Buzz
    if (x % 5 == 0){
        return "Buzz";}
    //return empty string
    return "";
    }
}
