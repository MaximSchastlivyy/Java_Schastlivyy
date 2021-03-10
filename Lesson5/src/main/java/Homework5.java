public class Homework5 {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Sharik", "black", 5);
        Dog dog2 = new Dog("Bobik", "white", 3);
        Horse horse1 = new Horse("Mustang", "black", 9);
        Horse horse2 = new Horse("Appolon", "brown", 5);
        Bird bird1 = new Bird("Kesha", "white", 4);
        Bird bird2 = new Bird("Gosha", "red-orange", 3);
        Cat cat1 = new Cat("Barsik", "orange", 11);
        Cat cat2 = new Cat("Tom", "grey", 15);

        dog1.run(200);
        dog2.run(310);
        dog2.jump(0.6F);
        horse1.jump(2);
        horse2.jump(4);
        bird1.swim(200);
        bird2.run(5);
        cat1.jump(1.5F);
        cat2.swim(100);
    }
}

