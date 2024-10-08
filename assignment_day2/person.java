package assignment_day2;

public class person {
    private String name;
    int age;
    String gender;

    public person( String name,int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayDetails(){
        System.out.println("Name: " + getName() + " Age: " + age + " Gender: " + gender);
    }
    public static void main(String[] args) {
        person p = new person("John Doe", 20, "Male");
        p.displayDetails();
        p.setName("jane doe");
        p.displayDetails();
    }
}
