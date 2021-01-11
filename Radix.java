public class Radix {

  public static int nth(int n, int col) {
    n = (int)(n / Math.pow(10, col) );
    return n % 10;
  }

  public static int length(int n) {
    int counter = 1;
    while(n > 10) {
      n = (int)(n / 10);
      counter++;
    }
    return counter;
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets) {
    original.clear();
    for(int i = 0; i < buckets.length; i++) {
      original.extend( buckets[i] );
    }
  }

}
