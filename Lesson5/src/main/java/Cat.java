public class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int value) {
        if (value > 0 && value <= 200){
            System.out.println("Кот пробежал " + value + " м.!");
        } else {
            System.out.println("Коты столько не бегают!");
        }

    }

    @Override
    public void swim(int value){
        System.out.println("Коты не умеют плавать!");
    }

    @Override
    public void jump(float value) {
        if (value > 0 && value <= 2){
            System.out.println("Кот прыгнул на " + value + " м.!");
        } else {
            System.out.println("Коты так не прыгают!");
        }

    }
}
