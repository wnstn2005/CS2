package class8;

public class ArraySumTest {
    public static void main(String[] args) {

        int[] array = {30, 5, 12, 30};
        int sum = 0;
        int avg = 0;

        for (int i = 0; i<array.length; i++){

            sum = sum + array[i];

        }

        avg = sum/(array.length);

        System.out.println(avg);
        System.out.println(sum);

    }
}
