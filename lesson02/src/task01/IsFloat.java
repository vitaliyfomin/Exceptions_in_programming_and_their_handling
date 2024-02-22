package task01;
class IsFloat {
    public static float isFloat(String input) {
        try {
            // Пытаемся преобразовать введенную строку в число с плавающей точкой
            float floatValue = Float.parseFloat(input);
            // Если преобразование прошло успешно, возвращаем полученное число
            return floatValue;
        } catch (NumberFormatException e) {
            // Если возникла ошибка при преобразовании, выводим сообщение об ошибке
            System.out.println("Your input is not a float number. Please, try again.");
            // Возвращаем Float.NaN для обозначения ошибки
            return Float.NaN;
        }
    }
}
