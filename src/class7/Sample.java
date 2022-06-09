package class7;

public class Sample {
    public static void main(String[] args) {

        Money money = new Money();

       money.add(new Dollar());
       money.add(new Won());
       money.add(new Enhwa());


        System.out.println(money.getValue());
    }
}
