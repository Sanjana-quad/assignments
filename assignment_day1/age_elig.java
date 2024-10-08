package assignment_day1;

import java.util.Scanner;

public class age_elig {
    private int age;
    public age_elig(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void print() {
        if(getAge()<18) System.out.print("Not eligible");
        else System.out.print("eligible");
    }
}

class ageEligDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        age_elig elig=new age_elig(sc.nextInt());
        elig.print();
    }
}