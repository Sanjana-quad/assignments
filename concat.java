package assign2;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {

        String a1,a2;
        System.out.println("Enter First Name:");
        Scanner a= new Scanner(System.in);
        a1=a.nextLine();
        System.out.println("Enter Second Name:");
        a= new Scanner(System.in);
        a2=a.nextLine();
        a.close();
        System.out.println(a1+" "+a2);
    }
}
