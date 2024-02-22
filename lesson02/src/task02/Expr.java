package task02;

import java.util.Arrays;

class Expr {

    public static double expr(int[] intArray, int d) {
        if (intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        }

        if (d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        }

        double result = (double) intArray[8] / d;
        System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + result);
        return result;
    }
}