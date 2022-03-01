package class2;

public class Number2 {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 몫만 계산한다. 정수형 계산이기 때문에 몫인 1만 반환된다.
        System.out.println(a % b); // 나머지를 계산한다. -- 헷갈림 조심


//        float c = 3.5f;
//        float d = 2.1f;
//
//
//        System.out.println(c/d);
//        System.out.println(c%d);

        int e = 751;

        int f = 5;

        System.out.println(e % f);


        int i = 8;
        int j = 5;

        // 증감 연산자 (++, --)

        i++;
        ++j;
        // !!!!! 주의점 ++의 위치에 따라 달라진다.

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++j);


        int k = 10;


        System.out.println(k);


        // A씨의 국어 점수는 80, 영어점수는 75, 수학 점수는 55다 평균을 변수로 생성하여 구하시오.

        int kor = 80;
        int eng = 75;
        int math = 55;
        int sum = kor + eng + math;


        System.out.println(sum / 3);


        // 자연수 17이 홀수인지 짝수인지 판별할 수 있을까?
        int num = 17;
        int even = 2;

        System.out.println(num % even);


    }
}
