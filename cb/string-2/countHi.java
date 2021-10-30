public class countHi {

// Return the number of times that the string "hi" appears anywhere in the given string.
  public static int countHi (String str) {
    int result = 0;
    for (int i = 0; i < (str.length() -1); i++) {
      if (str.substring(i, i + 2).equals("hi")) {
          result++;
      }
    }
    return result;
  }

  public static void main( String[] args) {
    System.out.println(countHi("abc hi ho"));
    System.out.println(countHi("ABChi hi"));
    System.out.println(countHi("hihi"));
  }

}
