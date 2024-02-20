package task02;
import java.util.Arrays;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Проверяем, что длины массивов равны
        if (a.length != b.length) {
            return new int[]{0}; // Возвращаем нулевой массив длины 1
        }

        // Создаем новый массив для хранения разностей элементов
        int[] c = new int[a.length];

        // Вычисляем разности элементов массивов a и b
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }

        return c;
    }
}

