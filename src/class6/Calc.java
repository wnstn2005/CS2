package class6;

class AddCalc {
    static int result = 0;
    static int add(int number) {
        result += number;
        return result;
    }
}


public class Calc {

    public static void main(String[] args) {
//        System.out.println(add(3));
//        System.out.println(add(4));
//        System.out.println(add(5));
//        System.out.println(add(6));
//        System.out.println(add(7));
//        System.out.println(add(8));
//        System.out.println(add(9));
//        System.out.println(add2(3));
//        System.out.println(add2(4));
//        System.out.println(add2(5));
//        System.out.println(add2(6));
//        System.out.println(add2(7));
//        System.out.println(add2(8));
//        System.out.println(add2(9));

        AddCalc addCalc = new AddCalc();
        AddCalc addCalc2 = new AddCalc();
        addCalc.add(3);
        addCalc.add(4);
        addCalc2.add(3);
    }

}


