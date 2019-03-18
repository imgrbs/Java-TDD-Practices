package taehub.leapyear.domains;

import org.junit.Assert;
import org.junit.Test;
import taehub.leapyear.domains.LeapYear;

public class LeapYearTests {
    private final LeapYear leapYear = new LeapYear();

    @Test
    public void test2000ShoudReturnLeapYear() {
        boolean isLeapYear = leapYear.isLeapYear(2000);
        Assert.assertEquals(isLeapYear, true);
    }

    @Test
    public void test2012ShoudReturnLeapYear() {
        boolean isLeapYear = leapYear.isLeapYear(2012);
        Assert.assertEquals(isLeapYear, true);
    }

    @Test
    public void test1997ShoudReturnNotLeapYear() {
        boolean isLeapYear = leapYear.isLeapYear(1997);
        Assert.assertEquals(isLeapYear, false);
    }

    @Test
    public void test2019ShoudReturnNotLeapYear() {
        boolean isLeapYear = leapYear.isLeapYear(2019);
        Assert.assertEquals(isLeapYear, false);
    }

    @Test
    public void test1999ShoudReturnNotLeapYear() {
        boolean isLeapYear = leapYear.isLeapYear(1999);
        Assert.assertEquals(isLeapYear, false);
    }
}
