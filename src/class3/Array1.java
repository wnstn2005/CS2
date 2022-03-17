package class3;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


        // 배열은 길이가 고정되어있다.

        /*
        *
        * 배열은 []를 통한 인자접근으로 출력, 바꿈을 수행한다.
        * */

        int[] a = {3,5,3};

        String[] b = {"월","화","수"};

        String[] c = new String[5];

        System.out.println(Arrays.toString(c));

        System.out.println(b);

        // 배열인자에 접근 (index 통하여)

        b[2] = "목";

        System.out.println(b[2]);

        // 배열의 길이

        System.out.println(b.length);


    }
}
