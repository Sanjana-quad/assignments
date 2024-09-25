package basics;

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

class mAin{
    public static void main(String[] args) {
        age_elig elig = new age_elig(18);
        elig.print();
    }
}

class mainn{
    public static void main(String[] args) {
        int age=20;
        age_elig elig=new age_elig(age);
        elig.print();
    }
}