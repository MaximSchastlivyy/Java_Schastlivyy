package lesson4;

import java.util.Arrays;

public class Homework4 {

    public static void main(String[] args) {

        //Четвертое задание
        Sotrudnik ivanov = new Sotrudnik("Иванов Алексей Сергеевич", "Технический директор", 89265444444L, 200000, 41);
        Sotrudnik sergeev = new Sotrudnik("Сергеев Иван Алексеевич", "Разработчик приложений", 89265455555L, 120000, 34);
        Sotrudnik alexeev = new Sotrudnik("Алексеев Сергей Иванович", "Тестировщик", 89265466666L, 80000, 32);

        System.out.println("Четвертое задание:");
        System.out.println(ivanov.getName() + " - " + ivanov.getPosition());
        System.out.println(sergeev.getName() + " - " + sergeev.getPosition());
        System.out.println(alexeev.getName() + " - " + alexeev.getPosition());
        System.out.println();

        //Пятое задание
        Sotrudnik[] sotArray = new Sotrudnik[5];
        sotArray[0] = new Sotrudnik("Иванов Алексей Сергеевич", "Технический директор", 89265444444L, 200000, 44);
        sotArray[1] = new Sotrudnik("Сергеев Иван Алексеевич", "Разработчик приложений", 89265455555L, 130000, 37);
        sotArray[2] = new Sotrudnik("Петров Аркадий Николаевич", "Разработчик сервисов", 89265433333L, 130000, 29);
        sotArray[3] = new Sotrudnik("Николаев Петр Аркадиевич", "Программист", 89265422222L, 120000, 42);
        sotArray[4] = new Sotrudnik("Алексеев Сергей Иванович", "Тестировщик", 89265466666L, 80000, 32);

        System.out.println("Пятое задание:");
        for (int i = 0; i < sotArray.length; i++) {
            if (sotArray[i].getAge() >= 40) {
                             sotArray[i].showFio();
            }
        }
        System.out.println();

        //Шестое задание
        System.out.println("Шестое задание:");
        for (int i = 0; i < sotArray.length; i++) {
            if (sotArray[i].getAge() >= 35) {
                sotArray[i].setSalary(sotArray[i].getSalary() + 10000);
                sotArray[i].showFio();
            }
        }
        System.out.println();

        //Седьмое задание
        System.out.println("Седьмое задание:");
        ivanov.showId();
        sergeev.showId();
        alexeev.showId();

        for (int i = 0; i < sotArray.length; i++) {
            sotArray[i].showId();
        }
    }







}
