package assignment_day2;

public class Car {
    public void sound(){
        System.out.println(" sound");
    }
}
class Honda extends Car{
    public void sound(){
        System.out.println("honda sound");
    }
}
class Audi extends Car{
    public void sound(){
        System.out.println("audi sound");
    }
}

class CarDemo{
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.sound();
        Honda honda = new Honda();
        honda.sound();
    }
}
