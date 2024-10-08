package assignment_day1;

public class pattern {
    public static void main(String[] args) {
        int i=1,j=2,n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
