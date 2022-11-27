//1) Создать класс User для хранения о обработки данных о пользователе.
//     * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
//     *  - Возврата имени и фамилии полностью
//     *  - Увеличения возраста
//     *  - Вывода общей информации о пользователе
//     *  В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
//     * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
//     * В этом конструкторе сделать вызов другого конструктора этого же класса.
//     * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.
//     *
public class Homework {
    public static void main(String[] args) {
        User perso1 = new User();
        perso1.name = "Fedor";
        perso1.surname = "Stelkin";
        perso1.age = 25;
        perso1.pol = "Male";
        perso1.name();
        perso1.increaseAge();
        perso1.allInforma();
        perso1.setPol();
        System.out.println(" Меня зовут " + perso1.name + " моя Фамилия " + perso1.surname);
        System.out.println(" Возраст Fedor Stelkin " + perso1.age);
        System.out.println(" Вывести имя " + perso1.name + " Вывести фамилию " + perso1.surname + " Вывести возраст " + perso1.age);
        System.out.println(" Вывести пол " + perso1.pol);
    }
}

class User {

    String name;// создание полей класса User
    String surname;
    int age;
    String pol;

    void name() {
    }

    void increaseAge() {
        ++age;
    }

    void allInforma() {
    }

    void setPol() {
    }
}

