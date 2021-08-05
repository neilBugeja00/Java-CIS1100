package Dataobjects;

class PartTimer extends Employee{
    
    int hrsWorked;
    
    public PartTimer(int iNo, String iSurn, double iPay, int iHrs) {
        
        super (iNo, iSurn, iPay);
        hrsWorked = iHrs;
        
    }
    
    public String getData() {
        
        return super.getData() + "Hrs" + hrsWorked + "Rate of Pay" + pay;
        
    }
    
    public double getSalary () {
        
        return hrsWorked*pay;
        
    }
}
