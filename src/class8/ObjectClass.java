package class8;

public class ObjectClass {
    public void main(String[] args) {

        Test test = new Test();

        Test2 test2 = new Test2();



        test.tesMethod();
        test2.tesMethod();

    }





    class Test{
        public void tesMethod() {
            System.out.println("TEST");
        }
    }

    class Test2{
        public void tesMethod() {
            System.out.println("TEST");
        }
    }


}
