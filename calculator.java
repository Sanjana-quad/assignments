package assign2;

import java.util.Scanner;

public class calculator {
    public static int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int multiplication(int a, int b) {
        return a * b;
    }
    public double division(int a, int b,double[] r) {
        r[0]=a%b;
        return (double) a / b;
    }
    public static void main(String[] args) {
        System.out.println("Enter the operator: ");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        sc = new Scanner(System.in);
        int b = sc.nextInt();
        sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.close();
        if (a == '+') {
            System.out.println("Sum "+addition(b,c));
        }
        else if (a=='-'){
            System.out.println("Balance "+new calculator().subtraction(b,c));
        }
        else if (a=='*'){
            System.out.println("Product "+new calculator().multiplication(b,c));
        }
        else if (a=='/'){
            double[] r= new double[1];
            System.out.println("Quotient "+new calculator().division(b,c,r)+"\nremainder "+r[0]);

        }
        else System.out.println("Invalid operator");
    }
}
