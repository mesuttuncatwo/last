package tests;

import assignment1.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class AssignmentTest {

    @Test
    public void addTest() {
        Assert.assertEquals(4, Calculator.add(2,2));
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(2, Calculator.subtract(4,2));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(4, Calculator.multiply(2,2));
    }

    @Test
    public void divisionTest() {
        Assert.assertEquals(2, Calculator.div(4,2));
    }
}
