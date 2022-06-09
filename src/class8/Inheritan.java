package class8;

public class Inheritan {

    public void main(String[] args) {

        Cat cat = new Cat();

        class6.Cat cat2 = new class6.Cat();

        cat2.meow();
        cat.meow();
    }
    class Cat extends class6.Cat {


    }

    class Dog extends class6.Dog {

        int age;

    }

    Dog aasdfbaswdf3 = new Dog();

}
