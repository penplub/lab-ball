public class Counterset {
    private int count ;
    
    public Counterset(){
        count = 0;
    }
    public void increase(){
        count++;
    }
    public void reset(){
        count = 0;
    }
    public int getCount(){
        return count;
    }
}
