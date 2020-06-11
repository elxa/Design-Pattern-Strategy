package productInformation;

import java.util.Random;

public class Tshirt {

    private String name;
    private double price;
    private Size size;
    private Colour colour;
    private Fabric fabric;
    private static String[] names;

    //gia na einai pio peripoihmenos o kwdikas
    //arxikopoiw thn static metablhth names
    static {//static block
        names = new String[]{"Aloha", "Baseball", "Camp",
            "Epaulette", "Lumberjack", "Granddad", "Golf",
            "Henley", "Polo", "Tuxedo", "Tunic", "Sweatshirt"};
    }
//
//    {
//        //instance block
//        System.out.println("hffhf");
//    }
////    ta instance anhkoun sto antikeimeno enw to static sthn klash 
////    to static block 8a tre3ei otan fortw8ei sthn klash 
//    //to instance block 8a tre3ei ka8e fora pou dhmiourgeitai ena antikeimeno
    public Tshirt(String name, double price, Size size, Colour colour, Fabric fabric) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.colour = colour;
        this.fabric = fabric;
    }

    //paw na ta kanw ola automata ola na setarwntai automata
    public Tshirt() {
        this.name = randomName();
        this.size = randomSize();
        this.colour = randomColour();
        this.fabric = randomFabric();
        this.price = generatePrice(size.ordinal(), colour.ordinal(), fabric.ordinal());//pairnoume thn int timh pisw apo ena enum
    }
    
  

    public Size randomSize() {
        Random random = new Random();
        // random.nextInt(5);//epistrefei timh meta3u o kai 4
        Size[] sizes = Size.values();//exei oles tis times tou enum
        //0-array.length
        int randomNumber = random.nextInt(sizes.length);
        return sizes[randomNumber];//8elw ena random stoixeio
    }
    //epistrefei tuxaia ena colour

    public Colour randomColour() {
        Random random = new Random();
        Colour[] colours = Colour.values();//exei oles tis times tou enum
        //0-array.length
        int randomNumber = random.nextInt(colours.length);
        return colours[randomNumber];//8elw ena random stoixeio
    }

    //epistrefei tuxaia ena fabric
    public Fabric randomFabric() {
        Random random = new Random();
        Fabric[] fabrics = Fabric.values();//exei oles tis times tou enum
        //0-array.length
        int randomNumber = random.nextInt(fabrics.length);
        return fabrics[randomNumber];//8elw ena random stoixeio
    }
    //epistrefei tuxaia ena fabric
    public String randomName() {
        Random random = new Random();
        int randomNumber = random.nextInt(names.length);
        return names[randomNumber];//8elw ena random stoixeio
    }
    
    //upologizei thn timh me bash ta xarakthristhka
    private double generatePrice(int size, int colour, int fabric){
        String temp = " "+ size + colour + fabric;
        double timh = Double.parseDouble(temp)/10;
        return timh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Tshirt{" + "name=" + name + ", price=" + price + ", size=" + size + ", colour=" + colour + ", fabric=" + fabric + '}';
    }

}
