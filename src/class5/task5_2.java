package class5;

public class task5_2 {
    public static void main(String[] args) {
        // 평균 점수를 구해보자 (향상된 for 문 사용)
        int[] grades = {70, 60, 90, 70, 65, 23, 21, 35, 67};
        int sum = 0;


        for(int grade : grades) {
            sum = sum + grade;
        }
        double avg = (double) sum/grades.length;
        System.out.println("평균점수="+avg);

    }
}
