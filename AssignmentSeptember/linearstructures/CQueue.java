package linearstructures;
import dataobjects.*;
import linearnodes.*;


public class CQueue {
    //declare queue size & set root to null
    private final int CIRCULAR_QUEUE_SIZE = 20;
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

    public AnyClass listEmployee(String key){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                if(n.getData().getKey().equalsIgnoreCase(key)){                   
                    n.show();             
                }
            }
            n = n.getNext();
        }
        return null; //not found
    }

    public void listAll(){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                n.show();
            }
            n = n.getNext();
        }
    }

    public AnyClass editObject(String key){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                if(n.getData().getKey().equalsIgnoreCase(key)){                   
                    n.getData().edit();                 
                }
            }
            n = n.getNext();
        }
        return null; //not found
    }

    public AnyClass changePayOfAll(int percentage){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                //To change percentage value
            }
            n = n.getNext();
        }
        return null; //not found
    }
}//end class
