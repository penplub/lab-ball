import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text");
        int number = input.nextInt();
       if (number>=500) {
           System.out.print ("You value is high enough");
           
       } else {
        System.out.print ("You value is low enough");
           
       }

        

    }
    
}
