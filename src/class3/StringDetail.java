package class3;

import java.util.Arrays;

public class StringDetail {
    public static void main(String[] args) {

          //        0123456789
        String a = "hello java";

        // equals 함수 - 문자열이 같은지 비교하라

        System.out.println(a.equals("abc"));

        System.out.println(a.equals("hello java"));

        System.out.println(a.equals(2));

        // indexOf 함수 - 문자열의 INDEX 를 호출해라
        // 없을 시 -1 리턴

        System.out.println(a.indexOf("java"));

        System.out.println(a.indexOf("tava"));

        System.out.println(a.indexOf("lo"));

        // contains - 문자열이 있는지 검사하라 - true, false

        System.out.println(a.contains("tava"));

        // charAt - 인덱스에 해당하는 문자 출력

        System.out.println(a.charAt(6));

        // replaceAll - 해당1 문자열을 찾아서 해당2 문자열로 바꾸겠다.

        System.out.println(a.replaceAll("java","tava"));

        // substring - 문자열을 추출하겠다. (단, 마지막 자기자신은 포함안함)

        System.out.println(a.substring(5,9));

        System.out.println(a.substring(0,5));

        // toUpperCase - 모두 대문자로 출력
        // toLowerCase - 모두 소문자로 출력

        System.out.println(a.toUpperCase());


        // split - 문자열을 분리하겠다.

        System.out.println(Arrays.toString(a.split(" ")));





    }
}
