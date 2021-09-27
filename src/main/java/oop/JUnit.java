package oop;

public class JUnit {
    /**
     * find max of two.
     *
     * @param a first number
     * @param b second number
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * find min of array.
     *
     * @param arr array
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    /**
     * calculate BMI.
     *
     * @param weight in kg
     * @param height  in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = (double) Math.round(bmi * 10) / 10;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else {
            if (bmi <= 22.9) {
                return "Bình thường";
            } else {
                if (bmi <= 24.9) {
                    return "Thừa cân";
                } else {
                    return "Béo phì";
                }
            }
        }
    }
}
