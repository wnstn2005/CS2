package class4;

import java.util.HashMap;

public class task4 {
    //- grade 라는 map (HashMap)을 선언해서 A 90, b 80, 7 70 을 넣고 B를 추출하고 B를 제거해보자
    public static void main(String[] args) {
        HashMap<String, String> grade = new HashMap<>();

        grade.put("A", "90");
        grade.put("b", "80");
        grade.put("7", "70");

        System.out.println(grade.get("b"));

        grade.remove("b");


        System.out.println(grade);

    }



}




