package assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String name;
    public Employee(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Carl"));
        employees.add(new Employee("Dan"));
        employees.add(new Employee("Eve"));
        employees.add(new Employee("Fred"));

        List<Employee> filteremployees = employees.stream().filter(e->e.getName().startsWith("A")).toList();
        System.out.println("employee names starting with a: ");
        filteremployees.forEach(e->System.out.println(e.getName()));
    }
}
