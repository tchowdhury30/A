/**
TN | Tasnim Chowdhury, Mary, Nora Miller
HW25 -- Do I repeat myself?
Time Spent: 0.6 hr
**/

/**
DISCO:
QCC:
 - What does fenceW return when numPosts = 0?
**/

public class Repeater {
  public static String fenceW(int numPosts) {
    int counter = numPosts;
    if (counter ==  0) {
      return "";
    }
    String fence = "|";
    while (counter > 1) {
      fence = fence + "--|";
      counter--;
    }
    return fence;
  }

  public static String fenceR(int numPosts) {
    String fence = "|";
    if (numPosts ==  0) {
      return "";
    }
    if (numPosts == 1) {
      return fence;
    }
    fence = "|--" + fenceR(numPosts -1);
    return fence;
  }


public static void main(String[] args ) {
  System.out.println(fenceW(0));
  System.out.println(fenceW(1));
  System.out.println(fenceW(2));
  System.out.println(fenceW(3));
  System.out.println(fenceR(0));
  System.out.println(fenceR(1));
  System.out.println(fenceR(2));
  System.out.println(fenceR(3));
}
}
