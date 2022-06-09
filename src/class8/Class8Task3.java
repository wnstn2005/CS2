package class8;

public class Class8Task3 {
    //아래 배열에서 60점 이상의 점수의 평균을 구하시오.
//int[] array = {20, 55, 67, 82, 45, 33, 90, 78, 100, 12};
    public static void main(String[] args) {

        int[] array = {20, 55, 67, 82, 45, 33, 90, 78, 100, 12};
        int sum = 0;
        int avg = 0;
        int length = 0;

        for (int i : array) {

            if (i >= 60) {
                sum = sum + i;
                length = length + 1;

            }


        }

        avg = sum / length;

        System.out.println(avg);
    }

}
