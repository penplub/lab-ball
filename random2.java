import java.util.Random;
public class random2 {
    public static void main(String[] args) {
        Random r = new Random();
        int rand = 20 + r.nextInt(21);
        System.out.println("The sin of"+rand+"is "+ Math.sin(rand));
        System.out.println("The cosin of"+rand+"is "+ Math.cos(rand));
        System.out.println("The cosin of"+rand+"is "+ Math.tan(rand));

    }
    
}
