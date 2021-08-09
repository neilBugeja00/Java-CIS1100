package dataobjects;
import linearnodes.*;
import linearstructures.*;

public class PartTimer extends Employee{

    int hours;

    public PartTimer (int num, String surname, double pay, int hours) {
        
        super (num, surname, pay);
        this.hours = hours;      
    }

    public int getHours(){
        return hours;
    }

    public String getData(){
        return "Sequence number: "+getSeqNo() + "\nEmployee:        " +surname+ "\nSalary:          " + getSalary() +"\n" +"Hours:           "+getHours()+"\n";
    }
}
