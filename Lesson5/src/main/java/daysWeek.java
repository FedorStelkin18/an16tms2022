public class daysWeek {
    public static void main(String[] args) {
        //Задача на оператор switch!
        ////        Рандомно генерируется число От 1 до 7.
        ////        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
        ////        Если 6 или 7 – “Выходной”.
        int i = (int) (Math.random() * 7);
        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println(" Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Day off");
                break;
            case 7:
                System.out.println("Day off");
                break;

        }
    }
}
