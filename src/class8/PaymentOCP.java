package class8;

public class PaymentOCP {

    public void payment(String vendor, int pay){
        if ("SHINHAN".equals(vendor)) {
            // 신한은행 결제연동
        } else if ("NH".equals(vendor)) {
            // 농협은 결제 연동
        }
    }
}



//public class PaymentOCP {
//
//    public void payment(Vendor vendor, int pay){
//        vendor.payment(pay);
//    }
//}


interface Vendor {
    void payment(int pay);
    void shinhanPay(int pay);

}

interface Vendor2 {
    void payment(int pay);
    void nonghyub(int pay);

}

class Shinhan implements Vendor{

    @Override
    public void payment(int pay) {

    }

    @Override
    public void shinhanPay(int pay) {

    }
}



class Nonghyub implements Vendor2 {

    @Override
    public void payment(int pay) {
        // 농협은행 결제연동
    }

    @Override
    public void nonghyub(int pay) {

    }


}
