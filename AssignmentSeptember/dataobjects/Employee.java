package dataobjects;
import java.util.Scanner;

public class Employee extends AnyClass{
    String surname;
    double salary;

    public Employee (int num, String surname, double salary) {
        
        super (num);
        this.surname = surname;
        this.salary = salary;        
    }

    public double getSalary(){
        return salary;
    }

    public double setSalary(double salary){
        this.salary = salary;
        return salary;
    }

    public String getData(){
        return super.getData() + "\nEmployee:        " +surname+ "\nSalary:          " + getSalary() +"\n";
    }

    public String getKey(){
        return surname;
    }

    public void edit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Current Salary:" +getSalary());
        System.out.println("Enter new salary: ");
        double newSalary = in.nextDouble();   
        setSalary(newSalary);    
    }

    public void editAll(int percentage){
        double perc = percentage;
        double newSalary = getSalary()*(1+(perc/100));
        setSalary(newSalary);
    }
}
