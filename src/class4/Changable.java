package class4;

public class Changable {

    public static void main(String[] args) {


        String num = "123";

        System.out.println(num + 123);
        System.out.println(Integer.parseInt(num) + 123);

        final int num2 = 123;

        float num3 = 123.5F;

        System.out.println(Float.parseFloat(num));

        System.out.println(num2 + 123);
        System.out.println(String.valueOf(num3) + 123);
        System.out.println("" + num2 + 123);


        int a = 2;

        long b = 3;

        // 자동 형변환
        b = a;

        // 강제 형변환 (cast)
        a = (int) b;




    }
}
