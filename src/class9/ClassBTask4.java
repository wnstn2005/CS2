package class9;

import java.util.Scanner;

public class ClassBTask4 {
    //    0 ,1 ,1, 2, 3, 5, 8 , 13
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;


        // 정수를 입력받았을때 그 정수 이하까지의 피보나치 수열을 출력하는 로직;

        for (int i = 0; i <= a; i++) {

            System.out.println(fib(i));

        }


    }

    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}
