package lesson4;

public class Sotrudnik {

    private String name;
    private String position;
    private long tel;
    private int salary;
    private int age;

    private static int count=0;
    private int id = ++count;


    Sotrudnik (String name, String position, long tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public long getTel() {
        return tel;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

    public void showFio() {
        System.out.println(name + "; " + position + "; " + tel + "; " + salary + "; " + age);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showId() {
        System.out.println(id + ". " + name + "; " + position + "; " + tel + "; " + salary + "; " + age);
    }

}


/**
 * 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
 * 2 Конструктор класса должен заполнять эти поля при создании объекта;
 * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
 * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
 * 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
 */