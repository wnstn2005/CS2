package class6;

public class Poly {


    public static void main(String[] args) {
        addString(1,2);
        addString(1,"2");

    }



    static void addString(int number, String number2) {
        System.out.println(number+number2);
    }

    static void addString(int number, int number2) {
        System.out.println(number+""+number2);
//        System.out.println(name);
    }

    static void addString2(int number, String number2) {
        System.out.println(number+number2);
    }

    static void addString2(int number, int number2) {
        System.out.println(number+""+number2+"입니다..");
//        System.out.println(name);
    }



}
