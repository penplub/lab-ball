import java.util.Scanner;

public class lab201 {
    public static void main(String[] args) {
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 Number");
        answer = myMax(scan.nextInt(), scan.nextInt());
        System.out.print("Your max is" + answer);
    }

    public static int myMax(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

}