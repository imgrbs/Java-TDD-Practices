package taehub.fizzbuzz.domains;

import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTests {
    private Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void testFizzbuzzWithOneMustReturnOne() {
        Assert.assertEquals(fizzbuzz.show(1), "1");
    }

    @Test
    public void testFizzbuzzWithTwoMustReturnTwo() {
        Assert.assertEquals(fizzbuzz.show(2), "2");
    }

    @Test
    public void testFizzbuzzWithThreeMustReturnFizz() {
        Assert.assertEquals(fizzbuzz.show(3), "Fizz");
    }

    @Test
    public void testFizzbuzzWithFourMustReturnFour() {
        Assert.assertEquals(fizzbuzz.show(4), "4");
    }

    @Test
    public void testFizzbuzzWithFiveMustReturnBuzz() {
        Assert.assertEquals(fizzbuzz.show(5), "Buzz");
    }

    @Test
    public void testFizzbuzzWithSixMustReturnFizz() {
        Assert.assertEquals(fizzbuzz.show(6), "Fizz");
    }

    @Test
    public void testFizzbuzzWithSevenMustReturnSeven() {
        Assert.assertEquals(fizzbuzz.show(7), "7");
    }

    @Test
    public void testFizzbuzzWithEightMustReturnEight() {
        Assert.assertEquals(fizzbuzz.show(8), "8");
    }

    @Test
    public void testFizzbuzzWithNineMustReturnFizz() {
        Assert.assertEquals(fizzbuzz.show(9), "Fizz");
    }

    @Test
    public void testFizzbuzzWithTenMustReturnBuzz() {
        Assert.assertEquals(fizzbuzz.show(10), "Buzz");
    }

    @Test
    public void testFizzbuzzWithElevenMustReturnEleven() {
        Assert.assertEquals(fizzbuzz.show(11), "11");
    }

    @Test
    public void testFizzbuzzWithTwelveMustReturnFizz() {
        Assert.assertEquals(fizzbuzz.show(12), "Fizz");
    }

    @Test
    public void testFizzbuzzWithThirteenMustReturnThirteen() {
        Assert.assertEquals(fizzbuzz.show(13), "13");
    }

    @Test
    public void testFizzbuzzWithFourteenMustReturnFourteen() {
        Assert.assertEquals(fizzbuzz.show(14), "14");
    }

    @Test
    public void testFizzbuzzWithFiftyteenMustReturnFizzBuzz() {
        Assert.assertEquals(fizzbuzz.show(15), "FizzBuzz");
    }
}
