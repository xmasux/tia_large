package tia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassForBranchTest {
    @Test
    public void testSum() {
        assertEquals(3, new Calculator().sum(1, 2));
    }

    @Test
    public void testMinus() {
        assertEquals(1, new Calculator().minus(3, 2));
    }

    @Test
    public void testSum2() {
        assertEquals(1, new Calculator().sum(-1, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, new Calculator().multiply(3, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(1, new Calculator().divide(3, 2));
    }

    @Test
    public void testSumFloat() {
        assertEquals(5.0, new Calculator().sumFloat(3, 2));
    }

    @Test
    public void testMinusFloat() {
        assertEquals(1, new Calculator().minusFloat(3, 2));
    }

    @Test
    public void testMultiplyFloat() {
        assertEquals(6.0, new Calculator().multiplyFloat(3, 2));
    }

    @Test
    public void testDivideFloat() {
        assertEquals(1.5, new Calculator().divideFloat(3, 2));
    }
}
