//Напишите методы с переменным числом параметров:
//        1). выводящий все параметры на консоль,
//        2). вычисляющий сумму всех параметров,
//        3). произведение всех параметров,
//       4). сортирующий параметры по возрастанию.

package com.example.Varargs;

public class PassArray {
    // Использование- аргумента переменой длины совместно со стандартными аргументами.
//В этом примере msg – обычный параметр, a v – параметр vararg.
    public static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void sum(int... v) {
        int x = 0;
        System.out.print(" Параметры ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            x = v[i] + x;

        }
        System.out.print("Сумма параметров " + x);
        System.out.println();
    }

    public static void mult(int... v) {
        int x = 1;
        System.out.print(" Параметры ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            x = v[i] * x;

        }
        System.out.print("Произведение параметров " + x);
        System.out.println();
    }

    public static void sort(int... v) {
        int x = 1;

        System.out.print(" Параметры  до сортировки ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");}
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (j != 0 && v[j - 1] > v[j]) {
                    x = v[j - 1];
                    v[j - 1] = v[j];
                    v[j] = x;

                }
            }
        }System.out.println();
        System.out.print(" Параметры  после сортировки ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }System.out.println();


    }

    public static void main(String args[]) {
        sort(8, 7, 6, 5, 4, 3, 2);
        sum(1,2,2,3,4);
         mult(3,4,7,1,2,3,8,5);
         vaTest("Один параметр vararg: ", 10);
         vaTest("Три параметра vararg: ", 1, 2, 3);
         vaTest("Бeз параметров vararg: ");
    }
}
