package dataobjects;
import linearnodes.*;
import linearstructures.*;

public class Employee extends AnyClass{
    String surname;
    double pay;

    public Employee (int iNo, String surname, double pay) {
        
        super (iNo);
        this.surname = surname;
        this.pay = pay;        
    }

    public double getSalary(){
        return pay;
    }

    public String getData(){
        return super.getData() + " Employee " +surname+ " salary " + getSalary();
    }

    public String getKey(){
        return surname;
    }

    public void setName(double newPay){
        pay = newPay;
    }
}
