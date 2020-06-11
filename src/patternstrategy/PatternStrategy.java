package patternstrategy;

import troposPlhrwmhs.CashPayment;
import troposPlhrwmhs.BankTransferPayment;
import troposPlhrwmhs.CreditcardPayment;
import troposPlhrwmhs.Cart;

public class PatternStrategy {

    public static void main(String[] args) {
//        Tshirt t1=new Tshirt("s1",12, Size.L, Colour.BLUE, Fabric.CASHMERE); 
//        Tshirt t2=new Tshirt("s2",60, Size.M, Colour.ORANGE, Fabric.WOOL); 
//        Tshirt t3=new Tshirt("s3",100, Size.XXL, Colour.VIOLET, Fabric.COTTON); 
//        
//        Cart cart = new Cart();
//        cart.addProduct(t3);
//        cart.addProduct(t2);
//        cart.addProduct(t1);
//        
//        cart.showCart();
//        cart.removeProduct(t2);
//        cart.showCart();
//        double totalPrice = cart.calculateCartPrice();
//        System.out.println("price of cart = " + totalPrice);
              
               Cart cart = new Cart();
              
               cart.fillCart(2);
               cart.showCart();
               System.out.println("***Finished printing cart***************");
               double totalPrice = cart.calculateCartPrice();
               System.out.println("total Price " + totalPrice);
        /*
        timh < 100 cash
        an h timh einai <200 credit card
        alliws bankTransfer
        */ 
        //efarmozoume thn strategy pattern
        if(cart.calculateCartPrice()<100){
            CashPayment c = new CashPayment();
            cart.executeStrategy(c);
        }if(cart.calculateCartPrice()<200){
            CreditcardPayment ccp = new CreditcardPayment("MyCreditCard", "Visa", "1234", "999", 2021);
            cart.executeStrategy(ccp);
        }else{
            BankTransferPayment btp = new BankTransferPayment("Preiraiws", "123456");
                    cart.executeStrategy(btp);
        }
    }
    
}
