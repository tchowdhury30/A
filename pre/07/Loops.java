// Assignment 6 Loops
public class Loops {
  //Exercise 3
/*
  public static int power(double x, int n){
    int a = 1;
    double ans = x;
    while (a < n){
      ans = Double.valueOf(ans*x);
      a = a + 1;
    }
    return ans;
    //error with double and int that I don't understand!
  }
*/
  // Exercise 4
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      int a = (n-1);
      int ans = n;
      while (a > 0) {
        ans = ans*a;
        a = a - 1;
      }
      return ans;
    }
  }
  // Exercise 5

  public static void main(String[] args) {
//    System.out.println(power(2,4));
    System.out.println(factorial(6));
  }

}
