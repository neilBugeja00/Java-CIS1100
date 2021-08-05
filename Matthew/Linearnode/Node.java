package Linearnode;
import Dataobjects.*;

public class Node
{
    public AnyClass obj; 
    public Node next;
    
    public Node(AnyClass newObj) {
        
        obj = newObj;
    }
    
    public void show() {
        
        System.out.println(obj.getData());
    }
    
    public void editNode() {
        obj.edit();
    }
    
    public void LinearNode(AnyClass obj, Node next) {
    }
}
