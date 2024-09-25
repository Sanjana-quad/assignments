public class shape {
    void object(){
        System.out.println("object created");
    }
}
class circle extends shape{
    void volume() {
        System.out.println("volume created");
    }
}

class rectangle extends shape{
    void area() {
        System.out.println("area created");
    }
}

class mmain{
    public static void main(String[] args) {
        circle c = new circle();
        rectangle r = new rectangle();
        c.volume();
        r.area();
    }
}
