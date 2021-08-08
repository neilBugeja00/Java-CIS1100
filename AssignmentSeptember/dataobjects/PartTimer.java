package dataobjects;
import linearnodes.*;
import linearstructures.*;

public class PartTimer extends Employee{

    int hours;

    public PartTimer (int iNo, String surname, double pay, int hours) {
        
        super (iNo, surname, pay);
        this.hours = hours;      
    }
}
