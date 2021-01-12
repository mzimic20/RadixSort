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
    int k = 0;
    for(int i = 0; i < data.size(); i++) {
      if ( length( data.get(i) ) > k) k = length( data.get(i) );
    }
    SortableLinkedList clean = new SortableLinkedList();
    for(int i = 0; i < k; i++) {
      for(int n = 0; n < data.size(); n++) {
        (buckets[ nth( data.get(n), i) ]).add( data.get(n) );
      }
      clean.extend(data);
    }
    merge(data, buckets);
  }

  public static void radixSort(SortableLinkedList data) {

  }

}
