public class Dog {
    private int dogage;
    private String dogname;
    public Dog(int dogage ,String dogname){
        this.dogage = dogage;
        this.dogname = dogname;
    }
    public String setName(String dogname){
        this.dogname = dogname;
        return dogname;
        
        
    }
    public int setAge(int dogage){
        this.dogage = dogage;
        return dogage;
       
    }
    public String getName(){
        return dogname;
    }
    public int getAge(){
        return dogage;
    }
    public int peopleage(){
        this.dogage = dogage*7;
        return dogage;

    }
    public String toString(){
        String showname ="Dogname :";
        String showage = "  Dogage :";
        return showname +dogname+showage+dogage;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog(0, "");
        Dog dog2 = new Dog(0,"");
        dog1.setAge(5);
        dog1.setName("Bob");
        dog2.setAge(8);
        dog2.setName("poy");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("dog age to peopleage");
        System.out.println(dog1.peopleage());
        System.out.println(dog2.peopleage());


    }
    
}
