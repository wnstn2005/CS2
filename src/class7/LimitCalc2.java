package class7;

public class LimitCalc2 extends Calc2 {

    void add(int val) {

        this.value += val;

        if (value >= 300) {
            value = 300;
        }
    }


}
