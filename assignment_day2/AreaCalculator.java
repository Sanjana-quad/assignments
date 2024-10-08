package assignment_day2;

public class AreaCalculator {

    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double length) {
        return length * length;
    }
    public double calculateArea(double radius,boolean circle) {
        return Math.PI * radius *radius;
    }
}

class MAIN{
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        double squarer = calc.calculateArea(2);
        System.out.println(squarer);
        double rectarr = calc.calculateArea(3,4);
        System.out.println(rectarr);
        double circarr = calc.calculateArea(5,true);
        System.out.println(circarr);
    }
}
