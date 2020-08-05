package ch19.g.test;

public class Test02 {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    
    List list = new List(a);
    
    int[] r = list.toArray(new EvenFilter() {
      @Override
      public boolean accept(int value) {
        return (value % 2) == 1;
      }
    });
    
    for (int v : r) {
      System.out.println(v);
    }
  }

}
