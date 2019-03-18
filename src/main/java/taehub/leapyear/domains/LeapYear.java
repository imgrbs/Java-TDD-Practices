package taehub.leapyear.domains;

public class LeapYear {
    public boolean isLeapYear(int year) {
        boolean divideBy400 = this.isDivideByNumber(year, 400);
        boolean divideBy100 = this.isDivideByNumber(year, 100);
        boolean divideBy4 = this.isDivideByNumber(year, 4);
        if (divideBy100 && divideBy400) {
            return  true;
        }
        if (divideBy4 && divideBy100) {
            return  true;
        }
        if (divideBy4) {
            return  true;
        }
        return false;
    }

    private boolean isDivideByNumber(int year, int number) {
        return year % number == 0;
    }
}
