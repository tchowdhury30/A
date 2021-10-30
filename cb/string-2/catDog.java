public class catDog {
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

}
