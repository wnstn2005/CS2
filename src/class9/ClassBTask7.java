package class9;

import java.util.Scanner;

public class ClassBTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String sum = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            sum += a.charAt(i);
        }

        System.out.println(sum);

    }

    // 입력이 있으면 항상 역순으로 바꾸는 로직


    // abc -> cba


    // aaa
    // bbb

    //bbb
    //aaa

}
