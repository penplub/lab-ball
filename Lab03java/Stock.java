public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    private double changePercent;
    public Stock(){
        symbol = "Unassigned";
        name = "Unassigned";
        previousClosingPrice = 0;
        currentPrice = 0;
        changePercent = 0;

    }
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;

    }
   public Stock(String newSymbol , String newName){
       symbol = newSymbol;
       name = newName;

   }
    public void setPreviousClosingPrice(double price){
        previousClosingPrice = price;

    }
    public void setCurrentPrice(double cPrice){
        currentPrice = cPrice;
    }
	
    
}
