package assignment_day5;

import java.util.Scanner;

public class Reverse_sent {
    public static String reversed_sent(String b){
        String[] words= b.split(" ");
        StringBuilder reversed= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i!=0){reversed.append(" ");}
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b=a.nextLine();
        a.close();
        System.out.println(reversed_sent(b));
    }
}
