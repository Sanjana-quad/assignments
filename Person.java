package assign2;


import java.awt.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String first_name;
    private String last_name;
    private String dob;

    public Person(String first_name, String last_name, String dob) {
        this.first_name = first_name;
        this.last_name = last_name;
        System.out.println("success: " + dob);
        this.dob = dob;
    }
    String[] dob_part=getDob().split("-");
    int year=Integer.parseInt(dob_part[0]);
    int month=Integer.parseInt(dob_part[1]);
    int date=Integer.parseInt(dob_part[2]);
    Period age= Period.between(LocalDate.of(year,month,date),LocalDate.now());
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getDob() {
        System.out.println("success: "+ dob);
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }


    public int getAge() {
        return age.getYears();
    }

    public void display(){
        System.out.println(getFirst_name()+" "+getLast_name()+" "+getDob());
        if(getAge()>18) System.out.println("Adult");
        else System.out.println("Child");
    }

    public static void main(String[] args) {
        System.out.println("Enter first name:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Enter last name:");
        sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println("Enter dob:");
        sc = new Scanner(System.in);
        String c = sc.nextLine();
        System.out.println("Enter c:"+c);
        Person p = new Person(a, b, c);
        System.out.println("Enter c afteer:"+c);
        p.display();
        sc.close();
    }
}
