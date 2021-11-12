public class CS {

  public static boolean One(boolean p, boolean b) {
    return !(p && b) && (!p || b);
  }
// System.out.println(One(false, false));
//System.out.println(One(false, true));

  public static void Two() {
    System.out.println("a:" + (9 + 0.95));
    System.out.println("b:" + (995/100.0));
    System.out.println("c:" + (9. + 95/100));
    System.out.println("d:" + (9 + 95.0/100));
    System.out.println("e:" + (9 + "." + 95));
  }

  public static void Three() {
    for (int i=12; i>0; i-=3) {
      System.out.print(i);
    }
  }
//12963

  public static void Four() {
    int i=0;
    while(i<8) {
      System.out.print(i);
      i+=1;
    }
    System.out.println(i);
  }
//8

  public static void Eight() {
    int ga = 1024;
    int gb = 475 / 2;
    int gc = 5 / 7;
//    int gd = 3.9 / 1.3; // WRONG is a double?!
  }

  public static void Eleven() {
    double x = 5;
    double y = 2;
    int m = (int)(x + y + x / y - x * y - x / (10*y));
    System.out.println(m);
  }
//0

  public static void Twelve() {
    int xa = 160;
//    byte xb = 160;
    short xc = 160;
    long xd = 160;
    double xe = 160;
  } // all work

  public static void Sixteen() {
    System.out.println("1" + new String("2" + 3));
  }

  public static void Ninteen() {
    int x = 123;  int y = 0;
    while(x>0) {
      y *= 10;
      y += x % 10;
      x /= 10;
    }
    System.out.print(y);
  }
//321

  public static void Twenty(int a, int b, int c) {
//    System.out.printin(((a==b) || !(c<=b))  || True);
//    System.out.printin(((a==b) || !(c<=b))  || False);
  }

  public static void tfour() {
    int n = 253;
    for(int i=0; i<50; i++) n = (n+3) / 2;
    System.out.println(n);
  }

public static void main( String[] args ) {
  tfour();
}

}
