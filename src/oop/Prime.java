package oop;

public class Prime {
    /**
     * Primality test.
     *
     * @param n get number to test
     * @return boolean value show the number is prime or not
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
