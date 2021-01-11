public class Radix {

  public static int nth(int n, int col) {
    n = (int)(n / Math.pow(10, col) );
    return n % 10;
  }

  public static int length(int n) {
    return 0;
  }

  public static void merge(MyLinkedList original, MyLinkedList[] buckets) {

  }

}
