public class Objectclass {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();

        s1.a = 20;
        s1.b = 10;
        s2.a = 30;
        s2.b = 40;

        System.out.println(s1.a);
        System.out.println(s1.b);
        System.out.println(s2.a);
        System.out.println(s2.b);

        s1.display();
        s2.display();
        
    }
}
