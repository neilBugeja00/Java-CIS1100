import Linearnode.*;
import Dataobjects.*;

public class CQueue {

    private final int CIRCULAR_QUEUE_SIZE = 20;

    private LinearNode head = null;

    public CQueue() {
        // Create a circular list with 20 nodes
        for (int i = 0; i < CIRCULAR_QUEUE_SIZE; i++) {
            addLinearNode(new LinearNode(null));
        }
    }

    public boolean put(AnyClass newObj) {
        if (head.getData() == null) {
            head.setData(newObj);
            return true;
        }
        LinearNode n = head;
        while (n.getNext() != head) {
            n = n.getNext();
            if(n.getData() == null){
               n.setData(newObj);
                return true;
            }
        }
        return false;
    }
    
    public void listAll(){
        LinearNode n  = head;
        while (n.getNext() != head) {
            if(n.getData() != null){
                System.out.println(n.getData().getData() + "    ");
            }
            n = n.getNext();
        }
    }
    
    public AnyClass editObject(String key){
        LinearNode n  = head;
        while (n.getNext() != head) {
            if(n.getData() != null){
                if(n.getData().getKey().equalsIgnoreCase(key)){
                    return n.getData(); // Found and returned
                }
            }
            n = n.getNext();
        }
        return null; // Not found
    }
    
    public void changePayOfAll(int percent){
        LinearNode n  = head;
        while (n.getNext() != head) {
            if(n.getData() != null){
                // To change percent value of object here
            }
            n = n.getNext();
        }
    }

    private void addLinearNode(LinearNode node) {
        // If the head is set to null, it means that the circular list is currently 
        // empty and therefore the head should point 
        if (head == null) {
            head = node;
            node.setNext(head);
        } else {
            // Traverse until you arrive at the last node
            LinearNode n = head;
            while (n.getNext() != head) {
                n = n.getNext();
            }
            n.setNext(node);
            node.setNext(head);
        }
    }
}
