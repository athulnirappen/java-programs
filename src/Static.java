public class Static {
    int a = 10;

     int b=20;

      public static void main(String[] args) {
          Static s = new Static();
          Static s1 = new Static();
          System.out.println(s.a);
          s.hello();
          s.b = 50;
          s1.b = 100;
          



          System.out.println(s.b);
          System.out.println(s1.b);
      }
    
      void hello() {
        
      }
}
