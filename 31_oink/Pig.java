/***
Tasnim Chowdhury + Mary, Hamim Seam, Nora Miller
APCS
HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
2021-11-04r
time spent: 0.5hrs
DISCO
- Can't use comparison operator on a string with 1 character with a character
- Can and should use methods in other methods
- Convert char to String by adding empty string
- making variable final makes it unchangable
QCC
- Are there any other benefits to using final other than understanding the code better?

 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: Creates reference point for entire class when checking for vowels
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    for (int i=0; i<w.length(); i++) {
      if (w.charAt(i) == letter.charAt(0)) {return true;}
    }
    return false;
  }//end hasA()

  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    for (int i=0; i<VOWELS.length(); i++) {
      if (letter.charAt(0) == VOWELS.charAt(i)) {return true;}
    }
    return false;
  }

  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int ans = 0;
    for (int i=0; i<w.length(); i++) {
      if (isAVowel(w.substring(i))) {ans++;}
    }
    return ans;
  }

  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    return countVowels(w) > 0;
  }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w )
    {
      String ans = "";
      for (int i=0; i<w.length(); i++) {
        char a = w.charAt(i);
        if (isAVowel(a + "")) {
          ans += a;
        }
      }
      return ans;
    }

  public static void main( String[] args )
  {
    System.out.println(hasA("cat", "a"));
    System.out.println(hasA("cat", "p"));
    System.out.println(isAVowel("B"));
    System.out.println(isAVowel("a"));
    System.out.println(countVowels("aREejo0"));
    System.out.println(hasAVowel("zzz"));
    System.out.println(allVowels("meatball"));

  }//end main()

}//end class Pig
