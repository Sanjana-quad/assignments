public class AreaCalculator {

    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double length) {
        return length * length;
    }
    public double calculateArea(double radius,boolean iscircle) {
        return Math.PI * radius *radius;
    }
}

class MAIN{
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        double squarearr = calc.calculateArea(2);
        System.out.println(squarearr);
        double rectarr = calc.calculateArea(3,4);
        System.out.println(rectarr);
        double circarr = calc.calculateArea(5,true);
        System.out.println(circarr);
    }
}
