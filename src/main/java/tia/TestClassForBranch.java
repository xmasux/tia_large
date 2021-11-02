package tia;

public class TestClassForBranch {
    public int sum(int a, int b) {
        return sumImpl(a, b);
    }

    private int sumImpl(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        System.out.println("tia rocks");
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public float sumFloat(float a, float b) {
        return a + b;
    }

    public float minusFloat(float a, float b) {
        return a - b;
    }

    public float multiplyFloat(float a, float b) {
        return a * b;
    }

    public float divideFloat(float a, float b){
        return a / b;
    }
}
