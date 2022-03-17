package class4;

public class Enum1 {
    public static void main(String[] args) {
      System.out.println(CoffeeType.AMERICANO);
      System.out.println(CoffeeType.ICE_AMERICANO);
      System.out.println(CoffeeType.CAFE_LATTE);
    }

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
}

