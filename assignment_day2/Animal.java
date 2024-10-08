package assignment_day2;

public class Animal {
    void type(){
        System.out.println("bird");
    }
}
class bird extends Animal{
    void sound(){
        System.out.println("tweet");
    }
}

class owl extends bird{
    void walk(){
        System.out.println("no-sound");
    }
}

class maiN{
    public static void main(String[] args) {
        owl a = new owl();
        a.type();
        a.sound();
        a.walk();;
    }
}
