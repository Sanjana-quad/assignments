package assignment_day5;

import java.util.Scanner;

public class square_cube {
    double a;
    public square_cube(double a) {
        this.a = a;
    }
    public double square(double a){
        return a*a;
    }
    public double cube(double a){
        return a*a*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square_cube cube = new square_cube(sc.nextDouble());
        System.out.println(cube.square(cube.a));
        System.out.println(cube.cube(cube.a));
    }
}
