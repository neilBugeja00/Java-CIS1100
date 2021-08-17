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
            System.out.println("6. Present and delete first item in queue");
            System.out.println("7. Generate List");
            System.out.println("8. Exit");

            choice = in.nextInt();

            switch(choice){
                case 1: populateQueue(myQueue);
                    break;
                case 2: listAll(myQueue);
                    break;   
                case 3: searchEmployee(myQueue);
                    break; 
                case 4: updateEmployeePayment(myQueue);
                    break;
                case 5: updateAll(myQueue);
                    break; 
                case 6: serve(myQueue);
                    break;   
                case 7: generateList(myQueue);
                    break;            
            }
        }while(choice!=8);
    }

    public static void populateQueue(CQueue myQueue){
        Scanner in = new Scanner(System.in);
        int seqNo;
        String surname;
        double salary = 0;
        int hours = 0;

        System.out.println("How many new FULL TIME EMPLOYEES: ");
        int n = in.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print("Enter sequence number:");
            seqNo = in.nextInt();
            System.out.print("Enter employee surname(key): ");
            surname = in.nextLine();
            surname = in.nextLine();
            System.out.print("Enter employee salary: ");
            salary = in.nextDouble();
            System.out.println("");
            myQueue.put(new Employee(seqNo, surname, salary));
        }

        System.out.println("How many new PART TIME EMPLOYEES: ");
        n = in.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print("Enter sequence number:");
            seqNo = in.nextInt();
            System.out.print("Enter employee surname(key): ");
            surname = in.nextLine();
            surname = in.nextLine();
            System.out.print("Enter employee salary: ");
            salary = in.nextDouble();
            System.out.print("Enter employee hours: ");
            hours = in.nextInt();
            System.out.println("");
            myQueue.put(new PartTimer(seqNo, surname, salary, hours));
        }     
        
    }

    public static void listAll(CQueue myQueue){       
        myQueue.listAll();
    }

    public static void searchEmployee(CQueue myQueue){    
        Scanner in = new Scanner(System.in);
        String userSearch;   
        System.out.println("Enter surname(key): ");
        userSearch = in.nextLine();
        myQueue.listEmployee(userSearch);
        System.out.println("");


    }

    public static void updateEmployeePayment(CQueue myQueue){       
        Scanner in = new Scanner(System.in);
        String userSearch;   
        System.out.println("Enter surname(key): ");
        userSearch = in.nextLine();
        myQueue.editObject(userSearch);
        System.out.println("");
    }

    public static void updateAll(CQueue myQueue){  
        Scanner in = new Scanner(System.in);   
        System.out.println("Enter percentage to change payments by: ");
        System.out.println("Example: for 10% increase enter 10");
        System.out.println("Example: for 10% decrease enter -10");
        int user = in.nextInt();
        myQueue.changePayOfAll(user);
        System.out.println("Payment Updated!");
        System.out.println("New list:");
        myQueue.listAll();
    }

    public static void serve(CQueue myQueue){
        myQueue.serve();
    }

    public static void generateList(CQueue myQueue){
        myQueue.put(new Employee(1, "bugeja", 50000));
        myQueue.put(new Employee(2, "sant", 40000));
        myQueue.put(new PartTimer(3, "curmi", 30000, 35));
        myQueue.put(new PartTimer(4, "bocc", 20000, 12));
    }
}
