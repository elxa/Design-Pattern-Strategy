package troposPlhrwmhs;

public class CreditcardPayment implements PaymentStrategy{
    private String name;
    private String cardType;
    private String cardNumber;
    private String cvv;
    private int expirationYear;

    public CreditcardPayment(String name, String cardType, String cardNumber, String cvv, int expirationYear) {
        this.name = name;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationYear = expirationYear;
    }
    
    

    @Override
    public void pay(double price) {
        System.out.println("Paid " +price+" with credit card:" + this);
        
    }

    @Override
    public String toString() {
        return "Name=" + name 
                + ", CardType=" + cardType 
                + ", CardNumber=" + cardNumber 
                + ", cvv=" + cvv 
                + ", expirationYear=" + expirationYear;
    }
    
    
}
