package linearnodes;
import dataobjects.*;

public class Node {
    private Node next;
    private AnyClass data;

    public Node(AnyClass data){
        this.data = data;
    }

    public Node(Node next, AnyClass data){
        this.next = next;
        this.data = data;
    }

    //Used for node pointers
    public Node getNext() {
        return next;
    }

    //Used for node pointers
    public void setNext(Node next) {
        this.next = next;
    }

    //Used for node data
    public AnyClass getData() {
        return data;
    }

    //Used for node data
    public void setData(AnyClass data) {
        this.data = data;
    }

    public void show(){
        System.out.println(data.getData());
    }
}
