package linearstructures;
import dataobjects.*;
import linearnodes.*;


public class CQueue {
    CQueue queue = new CQueue();

    //declare queue size & set root to null
    private final int CIRCULAR_QUEUE_SIZE = 20;
    private Node root = null;

    public CQueue(){
        //create circular list with previously declared size
        for(int i=0; i<CIRCULAR_QUEUE_SIZE; i++){
            addNode(new Node(null));
        }
    }

    private void addNode(Node node){       
        if(root == null){
            root = node;
            node.setNext(root);
        }else{
            //Traverse until arrives at the last node
            Node n = root;
            while(n.getNext()!=root){
                n = n.getNext();
            }
            n.setNext(node);
            node.setNext(root);
        }        
    }

    private boolean put(AnyClass newObj){
        if(root.getData()==null){
            root.setData(newObj);
            return true;
        }
        Node n = root;
        while(n.getNext()!=root){
            n = n.getNext();
            if(n.getData()==null){
                n.setData(newObj);
                return true;
            }
        }
        return false;        
    }

    private AnyClass serve(){
        if(root == null){
            System.out.println("Root is null");
            
        }else{
            root = root.getNext();

        }
        root.show();
    }

    private test(){
        
    }

}//end class
