public class Librarian {
    public static void  main(String[] args) {
        Student student;
        Libarycard card1;
        student = new Student();
        student.setName("John Conor");
        student.setEmail("johncmu.ac.th");
        student.setId(4564);

        card1 = new Libarycard();
        card1.setOwnerName(student);
        card1.checkout(3);
        card1.checkin(1);

        System.out.println("Card info:");
        System.out.println(card1.toString() + "\n");



        Student student2;
        Libarycard card2;
        student2 = new Student();
        student2.setName("Marry Jane");
        student2.setEmail("Marrycmu.ac.th");
        student2.setId(14564698);

        card2 = new Libarycard();
        card2.setOwnerName(student2);
        card2.checkout(5);
        card2.checkin(2);

        System.out.println("Card info:");
        System.out.println(card2.toString() + "\n");
    }
    
}
