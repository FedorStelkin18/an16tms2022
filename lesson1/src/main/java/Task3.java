public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > 0) {
                count = count + 1;
            }
        }
        System.out.println("Количество положительных чисел" + count);
    }
}