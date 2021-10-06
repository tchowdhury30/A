/*
Team TJ (Tasnim + Mary, John)
APCS
HW011: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
*/


/**
DISCOVERIES

UNRESOLVED QUESTIONS
What does static do?
*/


public class BigSib {
        public static void main(String[] args){
        }
        public static void main(String str){
          return "Hey there, " + name + ", what is up???";
        }

}

public class BigSib {
	static String helloMsg;

	public static void setHelloMsg( String msg ) {
		helloMsg = msg;
	}

	public static String greet( String person ) {
		return helloMsg + " " + person;
	}
}
