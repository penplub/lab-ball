import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          Random ran = new Random(100);

            
          
         
          int random = 0+ran.nextInt();
          int guess = 0;
          while (guess<100) {
            System.out.print("Enter text");
              guess =input.nextInt();
            

            
          
          if (guess>random && guess<100) {
              System.out.println("Your number is higher than random number");
              
          } else if(guess<random) {
              System.out.println("Your number is lower than random number");
              
          }else if(guess == 999) {
              System.out.print("You lose the answer is"+guess);
          }else{
              System.out.println("You win");
          }
          
}

    }
    
}
