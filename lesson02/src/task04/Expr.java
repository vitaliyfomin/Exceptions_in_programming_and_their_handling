package task04;

class Expr {
    public static String expr(char a) throws Exception {
        if (a == ' ') {
            throw new Exception("Empty string has been input.");
        } else {
            return "Your input was - " + a;
        }
    }
}