package troposPlhrwmhs;

import productInformation.Tshirt;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Tshirt> products;

    public Cart() {
        products = new ArrayList<>(); //gia kalh texnikh ta arxikopoiw sto constructor
    }

    public void addProduct(Tshirt tshirt) {
        products.add(tshirt);
        System.out.println("Added Tshirt :" + tshirt.getName());//ektupwnei mono to onoma
    }

    public void removeProduct(Tshirt tshirt) {
        products.remove(tshirt);
    }

    public double calculateCartPrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice = totalPrice + products.get(i).getPrice();
        }
        return totalPrice;
    }

    public void showCart() {
        System.out.println("***********Printing items of cart*************");
        for (Tshirt tshirt : products) {
            System.out.println(tshirt.getName());
        }
    }
    
    public void executeStrategy(PaymentStrategy strategy){//ftixnoume th strategy
        double total = calculateCartPrice();
        strategy.pay(total);   
    }
    
    //mia me8odo pou gemizei to kala8i
    public void fillCart(int number){
        for(int i=0; i<number; i++){
            Tshirt t = new Tshirt();
          //  products.add(new Tshirt());
            products.add(t);
            System.out.println(t);
        }
    }

    public List<Tshirt> getProducts() {
        return products;
    }

}
