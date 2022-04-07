package class6;

public class Test {
    public static void main(String[] args) {

        // 클래스를 변경하는 위험한 구조 (캡슐화에 위배됨)
        Cat cat = new Cat();
        cat.age= 11;
        cat.weight = 15;

        cat.punch();

        // 객체 (= 인스턴스) 를 변경하는 안전한 구조 (캡슐화에 알맞음)
        Cat2 cat2 = new Cat2();
        cat2.setAge(12);

        Dog dog = new Dog();
        dog.setAge(7);
        dog.setWeight(10);
        dog.setType("말티즈");
        dog.setName("자브종");

        System.out.println(dog.getAge());

        Maltiz maltiz = new Maltiz();
        maltiz.bow();

        dog.setAge(5);
        System.out.println(dog.getAge());

        maltiz.setAge(6);
        System.out.println(maltiz.getAge());
    }
}
