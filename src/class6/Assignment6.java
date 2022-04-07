package class6;

public class Assignment6 {
    public static void main(String[] args) {

        Calc2 calc2 = new Calc2();

        UpgradeCalc2 upgradeCalc2 = new UpgradeCalc2();

        upgradeCalc2.add(10);
        upgradeCalc2.minus(10);

        System.out.println(upgradeCalc2.getValue());


    }
}
