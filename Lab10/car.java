public class car {
    private String model;
    private String make;
    public int year;

    

    public void setModel(String mod){
        model = mod;

    }
    public void setMake(String muk){
        make = muk;
    }
    public void setYear(int yea){
        year = yea;
    }
    public String getModel(){
        return model;
    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        return "make:"+make+"model:"+model+"Year"+year;
    }
    public void isAntique(){
        if (2021-year >= 45) {
            System.out.println("is antique");
            
        } else {
            System.out.println("not antique");
        }
    }
    
}
