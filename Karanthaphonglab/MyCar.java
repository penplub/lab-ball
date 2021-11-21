public class MyCar {
    public static void main(String[] args){
        //create objects
        Car toyota = new Car("red");
        Car honda = new Car("blue");
        // assign data to toyota object
        toyota.setSpeed(200);
        toyota.setMilage(1345);

        // assign data to honda object
        honda.setSpeed(300);
       honda.setMilage(8987);

        System.out.println("Toyota color:"+toyota.getColor()+"speed:"+toyota.getSpeed()+"milage:"+toyota.getMilage());
        System.out.println("Honda color:"+honda.getColor()+"speed "+honda.getSpeed()+ "milage"+honda.getMilage());
    }
    
}
