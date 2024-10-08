package assignment_day1;
import java.util.Scanner;

public class EvenSum {
    public int sum = 0;

    public int calculateSum(int[] ARR) {
        for (int j : ARR) {
            if (j % 2 == 0) sum += j;
        }
        return sum;
    }
}

class SumDemo {
    public static void main(String[] args) {
        System.out.println("array size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt();
        }

        EvenSum evenSum = new EvenSum();
        System.out.println("Sum of even numbers: " + evenSum.calculateSum(arr));

        sc.close();
    }
}
