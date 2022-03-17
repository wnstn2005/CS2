package class3;

import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {

        // 배열과 비슷한 자료형 LIST

        // 배열과 다른점 = LIST 는 크기가 정해져 있지 않다.

        /*
        *
        * LIST 는 add, set, get, remove 으로 한다.
        *
        * */

        ArrayList<Object> a = new ArrayList<>();

        // 리스트 추가

        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);

        // 리스트에서 값 바꾸기

        a.set(2, 100);

        a.add(0,1);

        System.out.println(a);

        System.out.println(a.size());

        System.out.println(a.contains(8));

        System.out.println(a.get(5));

        a.remove(6);

        System.out.println(a);


    }
}
