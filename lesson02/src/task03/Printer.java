package task03;

public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 5;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        if (b != 0) {
            System.out.println(a);
            System.out.println(result);
        }
    }
}