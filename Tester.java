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

    SortableLinkedList a = new SortableLinkedList();
    a.add(1);
    a.add(2);
    a.add(3);
    System.out.println(a);
    SortableLinkedList b = new SortableLinkedList();
    b.add(11);
    b.add(12);
    b.add(13);
    System.out.println(b);
    SortableLinkedList c = new SortableLinkedList();
    c.add(21);
    c.add(22);
    c.add(23);
    System.out.println(c);
    SortableLinkedList[] test = {b, c};
    System.out.println( Arrays.toString(test) );
    Radix.merge(a, test);
    System.out.println(a);
  }

}
