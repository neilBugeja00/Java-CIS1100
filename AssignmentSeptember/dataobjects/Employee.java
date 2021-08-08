package dataobjects;
import linearnodes.*;
import linearstructures.*;

public class Employee extends AnyClass{
    String surname;
    double pay;

    public Employee (int num, String surname, double pay) {
        
        super (num);
        this.surname = surname;
        this.pay = pay;        
    }

    public double getSalary(){
        return pay;
    }

    public String getData(){
        return super.getData() + "\nEmployee " +surname+ "\nsalary " + getSalary() +"\n";
    }

    public String getKey(){
        return surname;
    }

    public void setName(double newPay){
        pay = newPay;
    }
}
