public class lab4 {
    public static void main(String[] args) {
        int money = 0;
        int doub = 1;
        int total = 0;
       
        while (total<=1000000) {
            total = total + doub;
            doub = doub *2;
            money++; 
     
            
        }
        System.out.println(money);
            
           
    
}
}
