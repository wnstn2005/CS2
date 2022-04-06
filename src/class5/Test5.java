package class5;

public class Test5 {
    public static void main(String[] args) {

        // while 문을 사용해서 1~1000까지의 자연 수중 3의 배수의 합을 구해주세요.

//        int i = 1;
//        int sum = 0;
//
//        while (i < 1000) {
//            i++;
//
//            if (i % 3 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);


        // 별 찍기
        /*
         *
         * *
         * **
         * ***
         * ****
         * *****
         *
         *
         * */

        // System.out.println() - 한칸 띄면서 출력
        // System.out.print() - 바로 옆으로 출력


        for (int i = 0; i < 30; i++) {

            System.out.println("*");

            for (int j = 0; j < 30; j++) {
                System.out.println("");
                System.out.print("*");
            }

        }



        // 평균 점수를 구해보자 (향상된 for 문 사용)
       // int[] grades = {70, 60, 90, 70 , 65, 23, 21, 35, 67};

    }

}

