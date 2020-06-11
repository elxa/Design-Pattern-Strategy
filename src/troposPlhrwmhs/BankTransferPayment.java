
package troposPlhrwmhs;

public class BankTransferPayment implements PaymentStrategy{
    private String bankName;
    private String acountNumber;

    public BankTransferPayment(String bankName, String acountNumber) {
        this.bankName = bankName;
        this.acountNumber = acountNumber;
    }
    
    

    @Override
    public void pay(double price) {
        System.out.println("Paid $"+price+" with Bank Transfer:" +this);
        
    }

    @Override
    public String toString() {
        return "Bank Name=" + bankName + ", Acount Number=" + acountNumber;
    }
    
    
    
}
