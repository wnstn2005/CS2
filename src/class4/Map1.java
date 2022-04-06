package class4;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        HashMap<String, String> map4 = new HashMap<>();
        HashMap<String, String> map5 = new HashMap<>();
        HashMap<String, String> map6 = new HashMap<>();

        map.put("이름", "홍길동");
        map.put("나이", "44");
        map.put("나이2", "42");
        map.put("나이3", "43");
        map.put("나이4", "44");
        map.put("나이5", "45");
        map.put("나이6", "46");

        System.out.println(map.get("나이"));
        System.out.println(map.get("나이3"));

        map.remove("나이");

        System.out.println(map.size());

        System.out.println(map.keySet());


    }
}
