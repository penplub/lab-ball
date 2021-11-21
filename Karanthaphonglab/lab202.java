import java.util.Scanner;

public class lab202 {
    public static void main(String[] args) {
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 Number");
        answer = myMin(scan.nextInt(), scan.nextInt());
        System.out.print("Your min is" + answer);
    }

    public static int myMin(int x, int y) {
        if (x < y)
            return x;
        else
            return y;
    }

}