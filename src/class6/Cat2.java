package class6;

public class Cat2 {

    private String name;
    private int weight;
    private int age;
    private String color;
    private String type;


    public void meow() {
        System.out.println("MEOW");
    }

    public void punch(){
        System.out.println("낭낭펀치");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



