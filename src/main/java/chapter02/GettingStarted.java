package chapter02;

public class GettingStarted {
    public static int factorial(int n){
       return factorialHelper(n, 1);
    }

    private static int factorialHelper(int n, int acc){
        if(n <= 1) return acc;
        else return factorialHelper(n-1, acc * n);
    }
}
