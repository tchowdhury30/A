/**
Moo | Faiza Huda, Truthful Tom, Mary, Tasnim Chowdury, Kartik Vanjani, Krrish
APCS
HW24 -- Get It While You Can
Time Spent: 0.6 hr
**/

/**
DISCO:
 - You can't access private vars (ex.instance vars) thus accessor methods exist
 - | means 'or' and while not everything is false, it runs code
QCC:
 - Were we supposed to use this/this()?????
POST-v0 MODS:
 - Fixed up errors and types (wrong variables correspoding with wrong values)
 - Made bias 0.5 from the get go
**/
public class Driver {

  public static void main( String[] args ) {
	Coin gamble = new Coin ("quarter", "heads");
	Coin rabbit = new Coin ("quarter", "heads");
	int y = 0;
	int x = 10;
	while ((y < 655626) | (gamble.getHeadsCtr() < x) | (y/2005 < 327)) {
		gamble.flip();
		rabbit.flip();
		if (gamble.equals(rabbit))	{y++;}
	}
	System.out.println("No# Flips " + gamble.getFlipCtr());
	System.out.println("Heads Matching: " + gamble.getHeadsCtr());
	System.out.println("Total No# Matches: " + y);
  }//end main()

}//end class
