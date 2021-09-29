//Assignment 5 - Void Methods
public class Methods {
  //Exercise 2
  public static boolean isDivisible(int n, int m){
    return 0 == (n%m);
  }
  //Exercise 3
  public static boolean isTriangle(int a, int b, int c){
    return ((a+b) > c) && ((a+c) > b) && ((c+b) > a);
  }
  //Exercise 8
  public static int ack(int m, int n){
    if (m == 0) {
      return (n + 1);
    } else if ((m > 0) && (n == 0)) {
      return ack((m-1),1);
    } else if ((m > 0) && (n > 0)) {
      return ack((m-1),(ack(m,(n-1))));
    } else {
      System.out.println("Help");
    }
    return -9999;
  }
  public static void main(String[] args){
    System.out.println(isDivisible(10, 5));
    System.out.println(isTriangle(1,2,3));
    System.out.println(ack(2,2));
  }
}
