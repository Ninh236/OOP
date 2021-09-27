package oop;

public class Solution {

    private int numerator = 0;
    private int denominator = 1;

    /**
     * getter of numerator.
     *
     * @return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * setter of numerator.
     *
     * @param numerator change numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * getter of denominator.
     *
     * @return denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * setter of denominator.
     *
     * @param denominator change denominator
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * constructor.
     *
     * @param numerator   input numerator
     * @param denominator input denominator
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * find gcd.
     *
     * @param a first number
     * @param b second number
     * @return gcd of a and b
     */
    static int gcd(int a, int b) {
        while (a != 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        return Math.abs(b);
    }

    /**
     * reduce fraction.
     *
     * @return reduced fraction
     */
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return this;
    }

    /**
     * add two fractions.
     *
     * @param other other fraction
     * @return fraction after adding
     */
    public Solution add(Solution other) {
        numerator = numerator * other.getDenominator() + denominator * other.getNumerator();
        denominator *= other.getDenominator();
        return this;
    }

    /**
     * subtract two fractions.
     *
     * @param other other fraction
     * @return fraction after subtracting
     */
    public Solution subtract(Solution other) {
        numerator = numerator * other.getDenominator() - denominator * other.getNumerator();
        denominator *= other.getDenominator();
        return this;
    }

    /**
     * multiply two fractions.
     *
     * @param other other fraction
     * @return fraction after multiplying
     */
    public Solution multiply(Solution other) {
        numerator *= other.getNumerator();
        denominator *= other.getDenominator();
        return this;
    }

    /**
     * divide two fractions.
     *
     * @param other other fraction
     * @return fraction after dividing
     */
    public Solution divide(Solution other) {
        if (other.getNumerator() != 0) {
            numerator *= other.getDenominator();
            denominator *= other.getNumerator();
        }
        return this;
    }

    /**
     * compare two fractions.
     *
     * @param obj an object
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return numerator * other.getDenominator() == denominator * other.getNumerator();
        }
        return false;
    }

    public static void main(String[] args) {
        Solution fraction1 = new Solution(1, 0);
        Solution fraction2 = new Solution(3, 4);
        fraction2 = fraction2.multiply(fraction1);
        System.out.println(fraction2.getNumerator() + " " + fraction2.getDenominator());
        System.out.println(fraction2.equals(fraction1));
    }
}
