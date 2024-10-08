public class product {
    private int proid;
    private String proname;
    private double price;

    public product(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }
    public void display() {
        System.out.println(proid + " " + proname + " " + price);
    }
}

class Main{
    public static void main(String[] args) {
        product[] prod ={
                new product(1,"comp",67),
                new product(2,"choc",199),
                new product(3,"milk",2),
                new product(4,"egg",8),
                new product(5,"cheese",20)
        };

        for (product p:prod){
            p.display();
        }
    }
}
