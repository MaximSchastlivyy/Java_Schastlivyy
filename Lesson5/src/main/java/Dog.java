public class Dog extends Animal{

    int count;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.count = ++count;
    }

    @Override
    public void run(int value) {
        if (value > 0 && value <= (200 + 50 * count)){
            System.out.println("Собака пробежала " + value + " м.!");
        } else {
            System.out.println("Собаки столько не бегают!");
        }

    }

    @Override
    public void swim(int value) {
        if (value > 0 && value <= 10){
            System.out.println("Собака проплыла " + value + " м.!");
        } else {
            System.out.println("Собаки столько не плавают!");
        }

    }

    @Override
    public void jump(float value) {
        if (value > 0 && value <= 0.5){
            System.out.println("Собака прыгнула на " + value + " м.!");
        } else {
            System.out.println("Собаки так не прыгают!");
        }

    }

}
