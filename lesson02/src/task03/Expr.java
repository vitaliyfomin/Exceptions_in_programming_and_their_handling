package task03;

class Expr {

    public static double expr(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Невозможно выполнить операцию деления на ноль.");
            return 0;
        }
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}

