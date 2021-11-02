/*
Tasnim Chowdhury + Mary, Hamim Seam
APCS
HW29 -- Which Way Do You Roll?
2021-11-03
time spent: 1.5 hour
DISCO
- for (String s : args) {} parses through array and can use it to test cases in complier
- Integer.parseInt() converts String to Integer
- Integer.toString() converts Integer to String
QCC
- how do you come up with recursive functions faster?
*/

public class Commafier {


  public static String commafyF(int n) {
    String ans = "";
    String s = Integer.toString(n);
    int sLen = s.length();
    for (int i=0; i<sLen; i++) {
      ans+= s.charAt(i);
      if ((sLen-i) % 3 == 1 && (i != (sLen-1))) {
        ans+= ",";
      }
    }
    return ans;
  }

  public static String commafyR(int n) {
    String ans = "";
    String s = Integer.toString(n);
    int sLen = s.length();
    if (sLen <= 3) {return s;}
    return commafyR (Integer.parseInt(s.substring(0, sLen-3))) + "," + s.substring(sLen-3);
  }

  public static void main( String[] args) {
//    System.out.println(commafyF(3245362));
//    System.out.println(commafyR(3245362));
    for(String arg: args){
      System.out.println(commafyF(Integer.parseInt(arg)));
      System.out.println(commafyR(Integer.parseInt(arg)));
    }

  }

}
