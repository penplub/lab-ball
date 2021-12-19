public class Cartest {
    public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car();
        car1.setMake("Toyota");
        car2.setMake("Honda");
        car1.setModel("Model A");
        car2.setModel("Model B");
        car1.setYear(1998);
        car2.setYear(1879);
        System.out.println(car1.toString());
        System.out.println("Antique :");
        car1.isAntique();
        System.out.println(car2.toString());
        System.out.println("Antique :");
        car2.isAntique();

        
        
    }
  
    
}
