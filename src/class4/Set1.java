package class4;

import java.util.Arrays;
import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {

        /*
         *
         * 중복 허용 X
         * 순서가 없음
         *
         * */


        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));

        System.out.println(set);


        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));


        // 교집합

        HashSet<Integer> intersection = new HashSet<>(s1);

        intersection.retainAll(s2);

        System.out.println(intersection);


        // 합집합

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);

        System.out.println(union);


        // 차 집합

        HashSet<Integer> substract = new HashSet<>(s2);

        substract.removeAll(s1);

        System.out.println(substract);


    }
}
