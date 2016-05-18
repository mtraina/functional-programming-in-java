package chapter02;

public class GettingStarted {
    public static int factorial(int n){
       return factorialHelper(n, 1);
    }

    private static int factorialHelper(int n, int acc){
        if(n <= 1) return acc;
        else return factorialHelper(n-1, acc * n);
    }

    public static int fibonacci(int n){
        return fibonacciHelper(n, 0, 1);
    }

    private static int fibonacciHelper(int n, int acc, int sum){
        if(n == 0) return acc;
        if(n == 1) return sum;
        return fibonacciHelper(n - 1, sum, acc + sum);
    }
}
