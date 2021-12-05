import java.util.Date;

public class labtime {
  public static void main(String[] args) {
      Date date = new Date();
      int count = 1;
    //   long time = 10000;
    long time = System.currentTimeMillis();
      while (count <=20000){
          date.setTime(time);
          System.out.println(date.toString());
          count++;
        //   time*=10;
      }
      
        
    }
        
    
    
}