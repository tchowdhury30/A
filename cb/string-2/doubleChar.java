public class doubleChar {

// Given a string, return a string where for every char in the original, there are two chars.
  public static String doubleChar(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      result += str.charAt(i);
        result += str.charAt(i);
        }
      return result;
    }

  public static void main( String[] args) {
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("AAbb"));
    System.out.println(doubleChar("AAbb"));
  }
}
