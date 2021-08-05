import Dataobjects.*;

public class Test {

    public static void main(String[] args) {
        
        // For testing purposes only
        System.out.println("Program started");
        CQueue myCQueue = new CQueue();
        myCQueue.put(new AnyClass(5));
        myCQueue.put(new AnyClass(10));
        myCQueue.put(new AnyClass(15));
        myCQueue.put(new AnyClass(20));
        myCQueue.put(new AnyClass(25));
        
        myCQueue.listAll();
        
        System.out.println("Program stopped");
    }
    
}
