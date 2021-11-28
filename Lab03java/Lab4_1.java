public class Lab4_1 {
    public static void  main(String[] args) {
       Stock stock1;
       stock1 = new Stock("x symbol","dhuasd");
       stock1.setPreviousClosingPrice(34.5);
       stock1.setCurrentPrice(34.35);
       System.out.println("Change percent is: ");
       System.out.println(stock1.getChangePercent());


     



    
}
}
