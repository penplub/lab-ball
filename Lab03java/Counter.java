public class Counter {
    public static void  main(String[] args) {
      Counterset count1;
      count1 = new Counterset();
      int i =0;
      while (i<=10) {
          count1.increase();
          System.out.println(count1.getCount());
          i++;
      }
    count1.reset();
    System.out.println(count1.getCount());
      

    
}
}
