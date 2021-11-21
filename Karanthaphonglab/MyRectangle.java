public class MyRectangle {
    public static void main(String[] args){
       
        Rectangle square = new Rectangle(5,5);
        Rectangle non_square = new Rectangle(8,5);
        System.out.println("Square area:"+square.getArea()+"Square perimeter"+square.getPerimeter());
        System.out.println("Nonsquare area:"+non_square.getArea()+"Nonsquare perimeter"+non_square.getPerimeter());

         
    }
    
}
