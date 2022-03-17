package class3;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String i = "801215-1545484";

        System.out.println(Arrays.toString(i.split("-")));

        // 문자열 (a:b:c:d) 가 있다. 이것을 나누어서 c만 출력해보자

        String m = "a:b:c:d";

        String[] result = m.split(":");

        System.out.println(Arrays.toString(result));
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(1);

        System.out.println(a.get(2));

        char b = 65;

        System.out.println(b);


        int c = 16* 9;
        System.out.println(c);

    }


}
