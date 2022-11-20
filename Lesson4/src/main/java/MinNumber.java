import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        //Меньшее по модулю число
        //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
        // пользователем вещественных чисел с консоли.
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.print(" Ввведите число:а= ");
        a = sc.nextDouble();
        System.out.print(" Введите число:b= ");
        b = sc.nextDouble();
        System.out.print(" Введите число:с= ");
        c = sc.nextDouble();
        if (Math.abs(a) < Math.abs(b) && Math.abs(a) < Math.abs(c)) {
            System.out.println("Минимальное число а");
        } else if (Math.abs(b) < Math.abs(a) && Math.abs(b) < Math.abs(c)) {
            System.out.println("Минимальное число b");
        } else {
            System.out.println("Минимальное число с");
        }
    }
}
////3 возможно ваше решение  3 задачи проще
//
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        double absA = Math.abs(a);
//        double absB = Math.abs(b);
//        double absC = Math.abs(c);
//        System.out.println(Math.min(Math.min(absA, absB), absC));
