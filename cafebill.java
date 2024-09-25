package basics;

public class cafebill {
private int bill;
int puffs,pizza,cool_drinks;
public cafebill(int puffs, int pizza, int cool_drinks) {
    this.puffs = puffs;
    this.pizza = pizza;
    this.cool_drinks = cool_drinks;
}
public int puffcost(int num){
    return num *40;
}

public int pizzacost(int num){
    return num * 400;
}
public int cooldrinkcost(int num){
    return num * 120;
}

}

class mainN{
    public static void main(String[] args) {
        cafebill cafe = new cafebill(10,10,10);
        System.out.println(cafe.puffcost(5)+ cafe.pizzacost(5)+ cafe.cooldrinkcost(5));
    }
}
