import dataobjects.*;
import linearstructures.*;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        menu();
    }

    public static void menu(){
        int choice;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Please enter your selection:");
            System.out.println("1. Construct empty queue");
            System.out.println("2. Populate queue");
            System.out.println("6. Exit menu");

            choice = in.nextInt();

            switch(choice){
                case 1: constructQueue();
                    break;
                case 2: populateQueue();
                    break;            
            }
        }while(choice!=6);
    }

    public static void constructQueue(){
        CQueue myQueue = new CQueue();
    }

    public static void populateQueue(){

    }
}
