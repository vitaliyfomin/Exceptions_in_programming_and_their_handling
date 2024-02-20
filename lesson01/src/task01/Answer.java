class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = {1, 2, 3};
        // Пытаемся обратиться к четвёртому элементу массива, который не существует
        int element = array[3];
    }

    public static void divisionByZero() {
        int result = 10 / 0; // Пытаемся поделить на ноль
    }

    public static void numberFormatException() {
        String str = "abc";
        // Пытаемся преобразовать строку в число, которая не является числом
        int num = Integer.parseInt(str);
    }
}


