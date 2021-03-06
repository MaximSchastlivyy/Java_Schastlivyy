public class Horse extends Animal{

    public Horse(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int value) {
        if (value > 0 && value <= 1500){
            System.out.println("Лошадь пробежала " + value + " м.!");
        } else {
            System.out.println("Лошади столько не бегают!");
        }

    }

    @Override
    public void swim(int value) {
        if (value > 0 && value <= 100){
            System.out.println("Лошадь проплыла " + value + " м.!");
        } else {
            System.out.println("Лошади столько не плавают!");
        }

    }

    @Override
    public void jump(float value) {
        if (value > 0 && value <= 3){
            System.out.println("Лошадь прыгнула на " + value + " м.!");
        } else {
            System.out.println("Лошади так не прыгают!");
        }

    }

}
