package pav.matrosov;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        System.out.println("Введите два числа"); /** Просим ввести числа **/
        Scanner s = new Scanner(System.in); // Создаем новый объект класса Scanner
        double a = s.nextDouble(); /* Создаем переменную и присваиваем ей значения,
                                    введенные с клавиатуры, при помощи метода из класса Scanner */

        double b = s.nextDouble(); /* Создаем переменную и присваиваем ей значения,
                                    введенные с клавиатуры, при помощи метода из класса Scanner */

        System.out.println("Введите арифметиское действие (‘+’, ‘-’, ‘*’ или ‘/’)"); /** Просим выбрать арифметическое действие **/
        switch (s.next().charAt(0)) { // При помощи оператора switch создаем несколько вариантов поведения программы
            case '+': // Вариант сложения чисел
                System.out.printf("a + b = %.4f", (a + b));
                break;
            case '-': // Вариант разницы чисел
                System.out.printf("a - b = %.4f", (a - b));
                break;
            case '*': // Вариант умножения чисел
                System.out.printf("a * b = %.4f", (a * b));
                break;
            case '/': // Вариант деления чисел
                if (b == 0) { /** Не забываем про возможный кейс ввода второго числа
                                равным нулю и выборе действия деления */
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                System.out.printf("a / b = %.4f", (a / b));
                break;
            default:
                System.out.println("Вы ввели некорректный оператор");
                break;
        }
    }
}
