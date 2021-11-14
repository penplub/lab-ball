import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome to OOP Lab please select menu :");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("Welcome to menu 1");
        }else if(number == 2){
            System.out.println("Welcome to menu 2 ");  
        }else if(number==3){
            System.out.println("Welcome to menu 3 ");
        }else if(number==4){
            System.out.println("Welcome to menu 4 ");
        }else if(number==5){
            System.out.println("Bye see you tomorrow ");
            
        }else {
            System.out.println("Error not have number ");

           
       }

        

    }
    
}