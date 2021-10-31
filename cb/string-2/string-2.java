public class string-2 {

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

      // Return true if the string "cat" and "dog" appear the same number of times in the given string.
        public static boolean catDog(String str) {
          int catNum = 0;
          int dogNum = 0;
          for (int i = 0; i < (str.length() -2); i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catNum++;
              }
            if (str.substring(i, i + 3).equals("dog")) {
                dogNum++;
              }
            }
            return catNum == dogNum;
          }

        public static void main( String[] args) {
          System.out.println(catDog("catdog"));
          System.out.println(catDog("cat cat"));
          System.out.println(catDog("1cat1cadodog"));
        }

        /*
        Return the number of times that the string "code" appears anywhere in the given string,
        except we'll accept any letter for the 'd', so "cope" and "cooe" count.
        */

          public static int countCode(String str) {
            int result = 0;
            for (int i = 0; i < (str.length() -3); i++) {
              if ((str.substring(i, i + 2).equals("co") && (str.substring(i + 3, i + 4).equals("e")))) {
                  result++;
              }
            }
            return result;
          }

          public static void main( String[] args) {
            System.out.println(countCode("aaacodebbb"));
            System.out.println(countCode("codexxcode"));
            System.out.println(countCode("cozexxcope"));
          }

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

            /*
            Return true if the given string contains an appearance of "xyz"
            where the xyz is not directly preceeded by a period (.).
            So "xxyz" counts but "x.xyz" does not.
            */

              public static boolean xyzThere(String str) {
                for (int i = 0; i < (str.length() -2); i++) {
                  if (str.substring(i, i + 3).equals("xyz")) {
                    if (i == 0) {
                      return true;
                    } else if (!(str.substring(i-1, i).equals("."))) {
                      return true;
                    }
                }
              }
              return false;
            }

              public static void main( String[] args) {
                System.out.println(xyzThere("abcxyz")); //true
                System.out.println(xyzThere("abc.xyz")); //false
                System.out.println(xyzThere("xyz.abc")); //true
                System.out.println(xyzThere(".xyz")); // false
                System.out.println(xyzThere("12.xyz")); // false

              }
}
