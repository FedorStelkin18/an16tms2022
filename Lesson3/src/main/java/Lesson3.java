
public class Lesson3 {
    public static void main(String[] args) {
        // вызов метода
        int sum = sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        long result = ((long) a + b);
        if (result > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }
}