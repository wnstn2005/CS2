package class2;

public class Task {

    public static void main(String[] args) {
        int a = 2561;


        int num = 2;

        System.out.println("10진수 > 2진수");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toString(a,2));

        System.out.println("10진수 > 8진수");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toString(a,8));

        System.out.println("10진수 > 16진수");
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toString(a,16));

    }
}
