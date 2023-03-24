class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное спит");
    }

    public void eat() {
        System.out.println("Животное ест " + food);
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    public void eat() {
        System.out.println("Собака ест " + food);
    }

    public void bark() {
        System.out.println("Собака " + breed + " гавкает");
    }
}

class Cat extends Animal {
    private int livesLeft;

    public Cat(String food, String location, int livesLeft) {
        super(food, location);
        this.livesLeft = livesLeft;
    }

    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    public void eat() {
        System.out.println("Кошка ест " + food);
    }

    public void purr() {
        System.out.println("Кошка мурлычет");
    }
}

class Horse extends Animal {
    private String color;

    public Horse(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    public void run() {
        System.out.println("Лошадь " + color + " цвета бежит");
    }
}

class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.food);
        System.out.println("Местоположение: " + animal.location);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("кость", "будка", "Мопс");
        Cat cat = new Cat("рыба", "квартира", 9);
        Horse horse = new Horse("сено", "стойло", "рыжий");

        Vet vet = new Vet();

        vet.treatAnimal(dog);
        dog.makeNoise();
        dog.bark();

        vet.treatAnimal(cat);
        cat.makeNoise();
        cat.purr();

        vet.treatAnimal(horse);
        horse.makeNoise();
        horse.run();
    }
}
