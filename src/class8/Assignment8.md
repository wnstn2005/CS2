1. 문자열 바꾸기 


a:b::c::d -> a#b#c#d로 바꾸시오.

Hint: split, join


2. 밑의 로직을 수정하시오 


- C가 없을 경우 NULL 대신 60이 나오도록 수정해주세요

public class Sample {
    public static void main(String[] args) {
        HashMap<<String, Integer> a = new HashMap<>();
        a.put("A",90);
        a.put("B",80);
        System.out.println(a.get("C"));
    }
}


3. 아래 배열에서 60점 이상의 점수의 평균을 구하시오.

int[] array = {20, 55, 67, 82, 45, 33, 90, 78, 100, 12};



4. 피보나치 수열

0, 1, 1, 2, 3, 5, 8 ,13


n 을 입력하면 n 이하까지의 피보나치 수열을 출력하는 로직을 작성하시오 . (어려움 - 필수 아님!)