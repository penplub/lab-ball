public class Student{
    // data membeer
    private String name;
    private String email;
    private int studentid;
    //constructor
    public Student(){
        name = "Unassigned";
        email = "Unassigned";
        studentid = 0;
    }
    //retrun
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
        //assign
    }
    public int getId(){
        return studentid;
        //assign
    }
    public void setEmail(String address){
        email = address;
    }
    public void setName(String studentName){
        name = studentName;
    }
    public void setId(int id){
        studentid = id;
    }
}