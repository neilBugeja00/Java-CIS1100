package Linearnode;
import Dataobjects.*;


public class LinearNode {
    
    private LinearNode next;
    private AnyClass data;

    public LinearNode(AnyClass data){
        this.data = data;
    }
    
    public LinearNode(LinearNode next, AnyClass data) {
        this.next = next;
        this.data = data;
    }

    public LinearNode getNext() {
        return next;
    }

    public void setNext(LinearNode next) {
        this.next = next;
    }
        public AnyClass getData() {
        return data;
    }

    public void setData(AnyClass data) {
        this.data = data;
    }
}