public class Radix {

  public static int nth(int n, int col) {
    n = (int)(n / Math.pow(10, col) );
    return n % 10;
  }

  public static int length(int n) {
    String s = "" + n;
    return s.length();
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for(int i = 0; i < buckets.length; i++) {
      original.extend( buckets[i] );
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0; i < buckets.length; i++) {
      SortableLinkedList b = new SortableLinkedList();
      buckets[i] = b;
    }
    int k = 1;
    int n = 0;
    for(int i = 0; i < k; i++) {
      while( data.size() > 0) {
        n = data.remove(0);
        if (length(n) > k) k = length(n);
        (buckets[ nth(n, i) ]).add(n);

      }
      merge(data, buckets);
    }
  }

  public static void radixSort(SortableLinkedList data) {

  }

}
