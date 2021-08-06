import dataobjects.*;
import linearnodes.*;
import linearstructures.*;

public class Test {
    public static void main(String args[]) {
        System.out.println("Start");

        CQueue myQueue = new CQueue();        

        myQueue.put(new AnyClass(5));
        myQueue.put(new AnyClass(10));
        myQueue.put(new AnyClass(15));
        myQueue.put(new AnyClass(20));
        myQueue.listAll();
        System.out.println("end");
    }
}
