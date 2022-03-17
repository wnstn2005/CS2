package class4;

public class IF {
    public static void main(String[] args) {

        boolean result = false;

        int a = 3;
        int b = 5;
        int c = 3;

        if (a == b && a == c) {
            System.out.println("1");
        } else if (!result) {
            System.out.println("2");
            asdf(a,b,c);
        }



    }

    static void asdf(int a, int b, int c) {
        if (a == b || a == c) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }

}
