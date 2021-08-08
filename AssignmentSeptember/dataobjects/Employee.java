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
}
