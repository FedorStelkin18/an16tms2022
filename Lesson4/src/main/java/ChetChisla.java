import java.util.Scanner;

public class ChetChisla {
    public static void main(String[] args) {
        /*Проверка четности числа Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
        чётным или нет.
        Ввод числа осуществлять с помощью класса Scanner.
        Если пользователь введёт не целое число, то сообщать ему об ошибке.*/
        System.out.print(" Введите число  = ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int value = scan.nextInt();
            if (value % 2 == 0) {
                System.out.println("Вы ввели четное число");
            } else {
                System.out.println("Ошибка");
            }
        }
    }
}