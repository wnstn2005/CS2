package class4;

import java.util.Scanner;

public class task4_4 {
    //- 나이를 입력하면 (int age = ) 몇10대인지 반환하는 조건문

    public static void main(String[] args) {

        // 입력 방법
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(input);


        int age = Integer.parseInt(input);

//        age 10 ~ 20 = "11입니다"

        if (age == 11) {
            System.out.println("11입니다.");
        }


        if (age <= 20) {
            System.out.println("10대");
        } else if (age <= 30) {
            System.out.println("20대");
        } else if (age <= 40) {
            System.out.println("30대");
        } else if (age <= 50) {
            System.out.println("40대");
        } else if (age <= 60) {
            System.out.println("50대");
        } else if (age <= 70) {
            System.out.println("60대");
        } else if (age <= 80) {
            System.out.println("70대");
        } else if (age <= 90) {
            System.out.println("80대");
        } else if (age <= 100) {
            System.out.println("90대");
        } else {
            System.out.println("장수");
        }


    }

}




