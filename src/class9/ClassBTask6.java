package class9;

import java.util.Scanner;

public class ClassBTask6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split(",");

        int sum = 0;

        for (String s : b) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);

    }
}
