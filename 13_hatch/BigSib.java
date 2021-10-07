/*
Team TJ (Tasnim + Mary, John + Po)
APCS
HW13: Where do BigSibs Come From?
2021-10-06
*/


/**
DISCOVERIES

UNRESOLVED QUESTIONS
What does static do?
*/


public class BigSib {
  static String helloMsg;

  public BigSib(String n) {
    helloMsg = n;
  }

  public static String greet(String name){
    return(helloMsg + " " + name);
  }


}
