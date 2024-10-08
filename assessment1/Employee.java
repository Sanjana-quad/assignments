//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Employee {
   int id;
   String name;
   float basic_salary;
   float bonus;
   float net_salary;

    public Employee(int id, String name, float basic_salary) {
        this.id = id;
        this.name = name;
        this.basic_salary = basic_salary;
    }

    public float calcsalary(){
       return 0;
   }
   public float calcbonus(){
       return 0;
   }
   public void display(){

   };
}

class tem_employee extends Employee {
    int daily_wages;
    int no_of_day;
    public tem_employee(int id, String name, float basic_salary,int daily_wages, int no_of_day) {
        super(id,name,basic_salary);
        this.daily_wages = daily_wages;
        this.no_of_day = no_of_day;
    }
    @Override
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + (int)basic_salary);
        System.out.println("Employee Daily Wages: " + daily_wages);
    }
    @Override
    public float calcsalary() {
        return daily_wages*no_of_day;
    }
    @Override
    public float calcbonus() {
        if(daily_wages<1000) return ((float)15/100)*(daily_wages*no_of_day);
        else if(daily_wages>=1000 && daily_wages<1500) return ((float)12/100)*(daily_wages*no_of_day);
        else if(daily_wages>=1500 && daily_wages<1750) return ((float)11/100)*(daily_wages*no_of_day);
        else return ((float)8/100)*(daily_wages*no_of_day);
    }
}

class perm_employee extends Employee {
    int pf;
    public perm_employee(int id, String name, float basic_salary,int pf) {
        super(id,name,basic_salary);
        this.pf=pf;
    }
    public void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + (int)basic_salary);
        System.out.println("Employee PF: " + pf);
    }
    @Override
    public float calcsalary() {
        return basic_salary-pf;
    }
    @Override
    public float calcbonus() {
        if(pf<1000) return ((float) 10 /100)*basic_salary;
        else if(pf>=1000 && pf<1500) return ((float) 11.5 /100)*basic_salary;
        else if (pf>=1500 && pf<1800) return ((float) 12 /100)*basic_salary;
        else return ((float) 15 /100)*basic_salary;
    }
}

class MAIN{
    public static void main(String[] args) {
        Employee emp = new perm_employee(101,"Esther",25000,1500);
        emp.display();
        System.out.println("salary: " + (int)emp.calcsalary());
        System.out.println("bonus: " + (int)emp.calcbonus());
    }
}
