public class endOther {

/*
Given two strings, return true if either of the strings appears at the very end of
the other string, ignoring upper/lower case differences (in other words, the computation
should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version
of a string.
*/

  public static boolean endOther(String a, String b) {
    String aL = a.toLowerCase();
    String bL = b.toLowerCase();
    if (aL.length() >= bL.length()) {
      return (bL.equals(aL.substring((aL.length() - bL.length()), aL.length())));
      } else {
        return (aL.equals(bL.substring((bL.length() - aL.length()), bL.length())));
      }
    }


  public static void main( String[] args) {
    System.out.println(endOther("Hiabc", "abc")); //true
    System.out.println(endOther("AbC", "HiaBc")); //true
    System.out.println(endOther("abc", "abXabc")); //true

  }

}
