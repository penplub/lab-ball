public class Libarycard {
    private Student owner;
    private int borrowCnt;
    private int returnCnt;
    public Libarycard(){
        owner = null;
        borrowCnt = 0;
    }
    public void checkout(int numOfBooks){
        borrowCnt = borrowCnt+numOfBooks;
    }
    public void checkin(int numofreturn){
        returnCnt = borrowCnt-numofreturn;
    }
    public int getNumberofBooks(){
        return borrowCnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public void setOwnerName(Student student){
        owner = student;
    }
    public String toString(){
        return "Owner Name:       "+owner.getName()+ "\n"+"Email:       " + owner.getEmail() + "\n" +"Book Borrowed:      "+ "Student id:" + owner.getId() + "\n" +borrowCnt+ "\n"+"You should return" + returnCnt ;
    }
    
}
