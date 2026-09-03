abstract class Payment {

    abstract void pay();
}

class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using UPI");
    }
}

class NetBankingPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Net Banking");
    }
}

public class PaymentPolymorphism {

    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment();
        payment.pay();

        payment = new UPIPayment();
        payment.pay();

        payment = new NetBankingPayment();
        payment.pay();
    }
}