package task03;
class Expr {

    public static double expr(int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            printSum(a, b);
            return result;
        } else {
            return 0.0;
        }
    }

    public static void printSum(int a, int b) {
        // Выводим сумму чисел только если делитель не равен нулю
        if (b != 0) {
            System.out.println(a + b);
        }
    }
}