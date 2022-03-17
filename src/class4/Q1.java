package class4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        // grade라는 map (HashMap)을 선언해서 A 90, b 80, c 70 을 넣고 B를 추출하고 B를 제거해보자

        HashMap<String, String> map = new HashMap<>();

        map.put("A","90");
        map.put("B","80");
        map.put("C","70");


        System.out.println(map.get("B"));
        map.remove("B");

        System.out.println(map.keySet());


        //numbers를 리스트로 선언해서 값을 (1,1,1,1,4,33,23,32,5)를 넣고 중복을 제거해보자

//        HashSet<Integer> del = new HashSet<>(Arrays.)

    }
}
