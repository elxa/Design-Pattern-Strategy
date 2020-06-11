package troposPlhrwmhs;

public class CashPayment implements PaymentStrategy{

    @Override
    public void pay(double price) {
        System.out.println("very cheap. Paid...."+price+" with cash");
    }
    
}
