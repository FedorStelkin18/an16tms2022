public class Ameba {
    public static void main(String[] args) {
        //Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        ////   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int ameb = 1;
        for (int i = 3; i <= 24; i += 3) {
            if (ameb > 0) {
                ameb = ameb * 2;
                System.out.println(" Количество часов " + i);
                System.out.println("Количество амеб =" + ameb);
            }
        }
    }
}