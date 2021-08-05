package Dataobjects;
class Employee extends AnyClass {
    
    String surn;
    double pay;
    
    public Employee (int iNo, String iSurn, double iPay) {
        
        super (iNo);
        surn = iSurn;
        pay = iPay;
        
    }
    
    public double getSalary() {
        
        return pay;
        
    }
    
    public String getData() {
        
        return super.getData() + "Employee" + surn + "salary" + getSalary();
        
    }
    
    public String getKey(){
        
        return surn;
        
    }
    
    public void setName (double newPay) {
        
        pay = newPay;
        
    }
    
}
