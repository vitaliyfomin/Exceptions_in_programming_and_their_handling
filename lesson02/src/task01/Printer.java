package task01;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String input;

        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "Ivan"; // По умолчанию используем "Ivan", если аргумент не передан
        }
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        // Если результат не Float.NaN, выводим число, иначе программа уже вывела сообщение об ошибке
        if (!Float.isNaN(result)) {
            System.out.println(result);
        } else {
            // Если результат NaN, выводим сообщение об ошибке
            System.out.println("NaN");
        }
    }
}