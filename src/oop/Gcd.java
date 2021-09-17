package oop;

public class Gcd {
    /**
     *gcd.
     *
     * @param a get first number
     * @param b get second number
     * @return gcd of a and b
     */
    public static int gcd(int a, int b) {
        while (a != 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        return Math.abs(b);
    }
}