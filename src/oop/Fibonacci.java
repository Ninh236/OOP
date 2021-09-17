package oop;

public class Fibonacci {
    /**
     * find nth Fibonacci number.
     *
     * @param n nth
     * @return nth Fibonacci number
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        long f1 = 0;
        long f2 = 1;
        long f = 1;
        for (int i = 2; i <= n; i++) {
            if (f2 > Long.MAX_VALUE - f1) {
                return Long.MAX_VALUE;
            }
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
    }
}
