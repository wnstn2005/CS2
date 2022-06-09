package class7;


interface Money2 {

    int getValue();
}

class Dollar implements Money2 {

    public int getValue() {
        return 1200;
    }

}

class Won implements Money2 {

    public int getValue() {
        return 1;
    }


}

class Enhwa  implements Money2 {

    public int getValue() {
        return 800;
    }

}
public class Money {

    private int value = 0;

    public void add(Money2 money) {
        this.value += money.getValue();
    }

    public int getValue() {
        return this.value;
    }

}



