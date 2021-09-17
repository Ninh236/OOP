package oop;

public class Fraction {
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
    public Fraction(int numerator, int denominator) {
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
    public Fraction reduce() {
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
    public Fraction add(Fraction other) {
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
    public Fraction subtract(Fraction other) {
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
    public Fraction multiply(Fraction other) {
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
    public Fraction divide(Fraction other) {
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
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            return numerator * other.getDenominator() == denominator * other.getNumerator();
        }
        return false;
    }

}