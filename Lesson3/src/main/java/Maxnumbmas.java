public class Maxnumbmas {
    public static void main(String[] args) {
        //Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
        int[] array = {1, 20, 10, 30};
        int max = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
