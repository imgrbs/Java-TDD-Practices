package taehub.datastructure;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class HashTableApp {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,3};
    Hashtable<Integer, List<Integer>> hashtable = new Hashtable<Integer, List<Integer>>();
    for (int number : numbers) {
      List<Integer> list = hashtable.get(Integer.valueOf(number));
      if (list == null) {
        list = new LinkedList<Integer>();
      }
      list.add(number);
      hashtable.put(number, list);
    }

    int result = Integer.MAX_VALUE;
    int oldSize = Integer.MAX_VALUE;
    for (int number : numbers) {
      int size = hashtable.get(Integer.valueOf(number)).size();
      if (size < oldSize) {
        result = number;
        oldSize = size;
      }
    }
    System.out.println(result);
  }
}
