package taehub.fizzbuzz.domains;

public class Fizzbuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";

    public String show(int number) {
        boolean isModThree = this.isModThree(number);
        boolean isModFive = this.isModFive(number);
        if (isModThree && isModFive) {
            return FIZZ + BUZZ;
        }
        if (isModThree) {
            return FIZZ;
        }
        if (isModFive) {
            return BUZZ;
        }
        return Integer.toString(number);
    }

    private boolean isModThree(int number) {
        return number % 3 == 0;
    }

    private boolean isModFive(int number) {
        return number % 5 == 0;
    }
}
