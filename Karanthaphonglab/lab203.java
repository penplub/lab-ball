public class lab203 {
    public static void main(String[] args) {
        double answer;
        double x = 40;

        while (x <= 80) {
            answer = far(x);
            System.out.println(x + "-------------" + answer);
            x = x + 5;

        }

    }

    public static double far(double c) {
        double f;
        f = (9.0 / 5.0) * c + 32;
        return f;

    };
}
