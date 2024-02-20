package task03;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[]{0}; // Вернуть нулевой массив длины 1, если длины массивов не равны
        }

        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Деление на ноль!"); // Бросить исключение, если делитель равен нулю
            }
            result[i] = a[i] / b[i]; // Вычислить частное элементов двух массивов и поместить его в соответствующую ячейку результата
        }
        return result;
    }
}

