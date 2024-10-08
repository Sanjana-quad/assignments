package assignment_day5;

import java.util.Scanner;

public class boolean_result {

    public static void main(String[] args) {
        System.out.println("Enter value of a: ");
        Scanner a = new Scanner(System.in);
        int x=a.nextInt();
        System.out.println("Enter value of b: ");
        a = new Scanner(System.in);
        int y=a.nextInt();
        boolean result = x>y;
        System.out.println("The result is: "+result);
    }
}
