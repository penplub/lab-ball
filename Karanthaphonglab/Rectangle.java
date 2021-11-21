public class Rectangle {
    private int width;
    private int height;
    private int area ;
    private int perimeter ;
    private int circle;
  

    public Rectangle(int wi ,int hi ){
        width = wi;
        height = hi;
    }
    public int getWidth(){
        return width;
    }
    public int getHight(){
        return height;
    }
    public int getArea(){
        area = width * height;
        return area;

    }
    public int getPerimeter(){
        circle = width+height;
        perimeter = 2*circle;
        return perimeter;

    }

    
}
