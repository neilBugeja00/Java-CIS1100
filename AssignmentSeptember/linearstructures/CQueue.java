package linearstructures;
import dataobjects.*;
import linearnodes.*;


public class CQueue {
    CQueue queue = new CQueue();

    //declare queue size & set root to null
    private final int CIRCULAR_QUEUE_SIZE = 2;
    private Node root = null;

    public CQueue(){
        //create circular list with previously declared size
        for(int i=0; i<CIRCULAR_QUEUE_SIZE; i++){
            addNode(new Node(null));
        }
    }

    public void addNode(Node node){       
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

    public boolean put(AnyClass newObj){
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

    public void listAll(){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                System.out.println(n.getData());
            }
            n = n.getNext();
        }
    }

    public AnyClass editObject(String key){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                if(n.getData().getKey().equalsIgnoreCase(key)){
                    return n.getData(); //Key successfully found
                }
            }
            n = n.getNext();
        }
        return null; //not found
    }


    


}//end class
