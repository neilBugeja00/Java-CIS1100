package linearstructures;
import dataobjects.*;
import linearnodes.*;


public class CQueue {
    //declare queue size & set root to null
    private final int CIRCULAR_QUEUE_SIZE = 20;
    private Node root = null;

    public CQueue(){
        //create circular list with previously declared size
        for(int i=0; i<CIRCULAR_QUEUE_SIZE+1; i++){
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
            node.setNext(root);
            n.setNext(node);
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

    public AnyClass serve(){
        Node n = root;

        //If empty
        if(root.getData() == null){
            System.out.println("List is empty");
            return null;
        }else{
            System.out.println("Subject deleted: ");
            System.out.println("");
            root.show();
            while(n.getNext()!=root){
                //gives each node the value of the node infront of it.
                n.setData(n.getNext().getData());
                n = n.getNext(); 
            }
        }

        return null;
    }   

    public AnyClass listEmployee(String key, int seqNo){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                if(n.getData().getKey().equalsIgnoreCase(key) && n.getData().getSeqNo() == seqNo){                   
                    n.show();
                    return null;    
                }
            }
            n = n.getNext();
        }
        System.out.println("");
        System.out.println("NO MATCH WAS FOUND");
        return null;
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
                    return null;              
                }
            }
            n = n.getNext();
        }
        System.out.println("");
        System.out.println("NO MATCH WAS FOUND");
        return null; //not found
    }

    public AnyClass changePayOfAll(int percentage){
        Node n = root;
        while(n.getNext()!=root){
            if(n.getData()!=null){
                n.getData().editAll(percentage);
            }
            n = n.getNext();
        }
        return null; //not found
    }
}//end class
