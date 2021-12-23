
public class Driver{

  public static void main( String [] args ) {
    Rational e1 = new Rational(-2, 5);
    Rational e2 = new Rational(6, -15);
    Rational e3 = new Rational(1, 2);


    //testing CompareTo
    System.out.println(e1.compareTo(e2)); // 0
    System.out.println(e1.compareTo(e3)); // -1
    System.out.println(e1.compareTo("Hello World"));
    System.out.println(e2.compareTo(7));




  }

} //end of class
