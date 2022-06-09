package class8;

import java.util.HashMap;

public class Class8Task2 {

    private static Object HashMap;

    //C가 없을 경우 NULL 대신 60이 나오도록 수정해주세요
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);


        System.out.println(a.getOrDefault("C", 60));

        if (a.get("C") == null) {
            System.out.println(getC());
        } else {
            System.out.println(a.get("C"));
        }

        a.putIfAbsent("C", 60);
        System.out.println(a.get("C"));

//        System.out.println(a.get("C"));


    }

    public static int getC() {
        return 60;
    }
}
