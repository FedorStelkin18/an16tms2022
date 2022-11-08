public class mas1 {
    public static void main(String[] args) {
        // Метод должен вернуть среднее значение из массива чисел
        double[] array = {1, 2, 3, 4, 7};
        double result = 0;
        for (double m : array) {
            result += m;
        }
        System.out.println(result / array.length);
    }
}
