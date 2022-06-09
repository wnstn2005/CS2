package class7;

import java.util.ArrayList;

public class Calc2 {

    int value;

    Calc2() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] array) {
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        for (int i : array){

           sum += i;;
        }

        return sum / array.length;
    }

    int avg(ArrayList<Integer> arrayList) {
        int sum = 0;
//        for (int i = 0; i < arrayList.size(); i++) {
////            sum += arrayList.get(i);
////        }

        for (int i : arrayList){


            sum +=i;
        }

        return sum / arrayList.size();
    }
//
//    int avgg(ArrayList<Object> a = new ArrayList<>())
//
//    int sum = 0;
//    for(int k=0; k<a.size(); k++){
//        sum += a;
//    }
//
//    return sum/a;
}
