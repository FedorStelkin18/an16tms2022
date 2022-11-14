
public class Task {
    public static void main(String[] args) {
        System.out.print(maxFinder(100, 8));
        //Метод должен вернуть максимальное значение из двух чисел
    }

    public static int maxFinder(int a, int b) {
        int max = Math.max(a, b);
        return max;
    }
}

