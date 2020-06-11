package troposPlhrwmhs;

public interface PaymentStrategy {
    //ola ta interface einai public opote twra einai public k abstract
    void pay(double price);
    //oi metablhtes prepei na einai final 
    int price = 10; //8a to kanei automata final public static final
    //al variables are implicity final
    
}
