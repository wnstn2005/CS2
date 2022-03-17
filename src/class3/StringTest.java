package class3;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {

        String name = "Lee Sang sun";

        // 위 name 이라는 변수를 이순신(영어)이라는 이름으로 변경하여 이름만 출력하라 (대문자)

        String name2 = name.replaceAll("Lee Sang sun","Lee Soon Sin");

        String name3 = name2.toUpperCase(Locale.ROOT);

        System.out.println(name3.indexOf("S"));
        System.out.println(name3.indexOf("IN"));

        System.out.println(name3.substring(4,12));

        String changeName = "Soon Sin";

        name = name.replaceAll("Sang sun", changeName);

        System.out.println(name.substring(name.indexOf(changeName)).toUpperCase());



    }
}
