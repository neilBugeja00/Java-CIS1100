import dataobjects.*;
import linearstructures.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {        
        menu();
    }

    public static void menu(){
        CQueue myQueue = new CQueue();
        int choice;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Please enter your selection:");
            System.out.println("1. Populate queue");            
            System.out.println("2. List all object in queue");
            System.out.println("3. Search for employee");
            System.out.println("4. Update payment of a single person");
            System.out.println("5. Update payment of all persons by 10%");
            System.out.println("6. Exit");

            choice = in.nextInt();

            switch(choice){
                case 1: populateQueue(myQueue);
                    break;
                case 2: listAll(myQueue);
                    break;   
                case 3: searchEmployee(myQueue);
                    break; 
                case 4: updateEmployee(myQueue);
                    break;
                case 5: updateAll(myQueue);
                    break;              
            }
        }while(choice!=6);
    }

    public static void populateQueue(CQueue myQueue){ 
        System.out.println("");   
        
    }

    public static void listAll(CQueue myQueue){       
        
    }

    public static void searchEmployee(CQueue myQueue){       
        
    }

    public static void updateEmployee(CQueue myQueue){       
        
    }

    public static void updateAll(CQueue myQueue){       
        
    }

    public static void editSalary(CQueue myQueue){
        System.out.println("");
        myQueue.put(new Employee(1, "bugeja", 10000));
        myQueue.editObject("bugeja");
        myQueue.listAll();
    }
}
