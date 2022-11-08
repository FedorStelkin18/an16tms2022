import java.util.Scanner;

public class calculateHypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину катета а= ");
        double a = sc.nextDouble();
        System.out.println("Введите длину катета b= ");
        double b = sc.nextByte();
        double k = Math.sqrt(a * a + b * b);
        System.out.println("Длина гипотенузы " + k);
    }
}
