public class Bird extends Animal{

    public Bird(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int value) {
        if (value > 0 && value <= 5){
            System.out.println("Птица пробежала " + value + " м.!");
        } else {
            System.out.println("Птицы столько не бегают!");
        }

    }

    @Override
    public void swim(int value){
        System.out.println("Птицы не умеют плавать!");
    }

    @Override
    public void jump(float value) {
        if (value > 0 && value <= 0.2){
            System.out.println("Птица прыгнула на " + value + " м.!");
        } else {
            System.out.println("Птицы так не прыгают!");
        }

    }
}
