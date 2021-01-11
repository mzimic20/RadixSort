import java.util.Arrays;

public class Tester {

  public static void main(String[] args) {
    System.out.println( Radix.nth(1738, 0) );
    System.out.println( Radix.nth(1738, 1) );
    System.out.println( Radix.nth(1738, 2) );
    System.out.println( Radix.nth(1738, 3) );

    System.out.println( Radix.length(1738) );
    System.out.println( Radix.length(679) );
    System.out.println( Radix.length(360360360) );
    System.out.println( Radix.length(1) );
    System.out.println( Radix.length(9) );

    MyLinkedList a = new MyLinkedList();
    a.add("hello");
    a.add("bye");
    System.out.println(a);
    MyLinkedList b = new MyLinkedList();
    b.add("zdravo");
    b.add("dovidenja");
    System.out.println(b);
    MyLinkedList[] test = {a, b};
    System.out.println( Arrays.toString(test) );
    Radix.merge(a, test);
    System.out.println(a);
  }

}
