/**
Ocho!: Nora, Tasnim, Hamim
APCS
HW 21:  STAtisTically Speaking...
2021-10-20
**/

/**
DISCO
- Math.sqrt(a) to find the square root of a (double type)
- How do you square root a number without it being a double or without using another class?

QCC
- Is the GeoMean of 2 negative numbers positive or negative?
- How do you use exponents in Java?
- I can't figure out how to make the square root of a double into an integer without cast typing
**/

public class Stats {
  public int mean(int a, int b) {
    return (a+b)/2;
  }

  public double mean(double a, double b) {
    return (a+b)/2.0;
  }

  public int Max(int a, int b) {
    if (a==b) {
      return a;
    } else if (a>b){
      return a;
    } else {
      return b;
    }
  }

  public int geoMean(int a, int b) {
    return (Math.sqrt(a*b);
//incompatible types: possible lossy conversion from double to int
  }

  public double geoMean(double a, double b) {
    return Math.sqrt(a*b);

  }

}
